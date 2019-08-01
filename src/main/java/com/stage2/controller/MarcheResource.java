package com.stage2.controller;

import com.stage2.dao.AppelOffreRepository;
import com.stage2.dao.MarcheRepository;
import com.stage2.entities.AppelOffre;
import com.stage2.entities.Marche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController

public class MarcheResource {
    @Autowired
    private MarcheRepository marcheRepository;
    @Autowired
    private AppelOffreRepository appelOffreRepository;

    @GetMapping("/marche")
    public List<Marche> retrieveAllMarche() {

        return (List<Marche>) marcheRepository.findAll();
    }

    @GetMapping("/marche/{id}")
    public Marche retrieveMarche(@PathVariable long id) throws MarcheNotFoundException {
        Optional<Marche> marche = marcheRepository.findById(id);

        if (!marche.isPresent())
            throw new MarcheNotFoundException("id-" + id);

        return marche.get();
    }
    @DeleteMapping("/marche/{id}")
    public void deleteMarche(@PathVariable long id) {
        marcheRepository.deleteById(id);
    }

    @PostMapping("/marche")
    public ResponseEntity<Object> createMarche(@RequestBody Marche marche) {
        Marche savedMarche = marcheRepository.save(marche);



        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedMarche.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    @PutMapping("/marche/{id}")
    public ResponseEntity<Object> updateMarche(@RequestBody Marche marche, @PathVariable long id) {

        Optional<Marche> marcheOptional = marcheRepository.findById(id);

        if (!marcheOptional.isPresent())
            return ResponseEntity.notFound().build();

        marche.setId(id);

        marcheRepository.save(marche);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/marchebyidstructure/{id}")
    public List<Marche> findAllByIdStructure(@PathVariable long id)  throws MarcheNotFoundException {
        List<Marche> marches = marcheRepository.findAllByIdStructure(id);

        if (marches.isEmpty())
            throw new MarcheNotFoundException("id-" + id);

        return (List<Marche>) marches;
    }
    @GetMapping("/marchebyidprojet/{id}")
    public List<Marche> findAllByIdProjet(@PathVariable long id)  throws MarcheNotFoundException {
        List<Marche> marches = marcheRepository.findAllByIdProjet(id);
        if (marches.isEmpty())
            throw new MarcheNotFoundException("id-" + id);
        return (List<Marche>) marches;
    }
    @GetMapping("/marchebyidao/{id}")
    public List<Marche> findAllByAppelOffre(@PathVariable long id) throws MarcheNotFoundException, AppelOffreNotFoundException {
        Optional<AppelOffre> ao = appelOffreRepository.findById(id);
        List<Marche> marches = marcheRepository.findAllByAppelOffre_Id(ao.get().getId());
        if (marches.isEmpty())
            throw new MarcheNotFoundException("id-" + id);
        return (List<Marche>) marches;
    }
}
