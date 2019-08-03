package com.stage2.service;

import com.stage2.dao.ProjetRepository;
import com.stage2.entities.Projet;
import com.stage2.exceptions.ProjetNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class ProjetService implements IProjetService{
    @Autowired
    private ProjetRepository projetRepository;

    @Override
    public List<Projet> retrieveAllProjet() {

        return (List<Projet>) projetRepository.findAll();
    }

    @Override
    public Projet retrieveProjet(@PathVariable long id) throws ProjetNotFoundException {
        Optional<Projet> projet = projetRepository.findById(id);

        if (!projet.isPresent())
            throw new ProjetNotFoundException("id-" + id);

        return projet.get();
    }
    @Override
    public void deleteProjet(@PathVariable long id) {
        projetRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<Object> createProjet(@RequestBody Projet projet) {
        Projet savedProjet = projetRepository.save(projet);



        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedProjet.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    @Override
    public ResponseEntity<Object> updateProjet(@RequestBody Projet projet, @PathVariable long id) {

        Optional<Projet> projetOptional = projetRepository.findById(id);

        if (!projetOptional.isPresent())
            return ResponseEntity.notFound().build();

        projet.setId(id);

        projetRepository.save(projet);

        return ResponseEntity.ok().build();
    }
}
