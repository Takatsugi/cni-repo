package com.stage2.controller;

import com.stage2.dao.ProjetRepository;
import com.stage2.entities.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class ProjetResource {
    @Autowired
    private ProjetRepository projetRepository;

    @GetMapping("/projet")
    public List<Projet> retrieveAllProjet() {

        return (List<Projet>) projetRepository.findAll();
    }

    @GetMapping("/projet/{id}")
    public Projet retrieveProjet(@PathVariable long id) throws ProjetNotFoundException {
        Optional<Projet> projet = projetRepository.findById(id);

        if (!projet.isPresent())
            throw new ProjetNotFoundException("id-" + id);

        return projet.get();
    }
    @DeleteMapping("/projet/{id}")
    public void deleteProjet(@PathVariable long id) {
        projetRepository.deleteById(id);
    }

    @PostMapping("/projet")
    public ResponseEntity<Object> createProjet(@RequestBody Projet projet) {
        Projet savedProjet = projetRepository.save(projet);



        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedProjet.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    @PutMapping("/projet/{id}")
    public ResponseEntity<Object> updateProjet(@RequestBody Projet projet, @PathVariable long id) {

        Optional<Projet> projetOptional = projetRepository.findById(id);

        if (!projetOptional.isPresent())
            return ResponseEntity.notFound().build();

        projet.setId(id);

        projetRepository.save(projet);

        return ResponseEntity.ok().build();
    }
}
