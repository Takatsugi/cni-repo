package com.stage2.controller;

import com.stage2.dao.AppelOffreRepository;
import com.stage2.entities.AppelOffre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class AppelOffreResource {
    @Autowired
    private AppelOffreRepository appelOffreRepository;


    @GetMapping("/appeloffre")
    public List<AppelOffre> retrieveAllAppelOffre() {
        return (List<AppelOffre>) appelOffreRepository.findAll();
    }

    @GetMapping("/appeloffre/{id}")
    public AppelOffre retrieveAppelOffre(@PathVariable long id) throws AppelOffreNotFoundException {
        Optional<AppelOffre> appeloffre = appelOffreRepository.findById(id);

        if (!appeloffre.isPresent())
            throw new AppelOffreNotFoundException("id-" + id);

        return appeloffre.get();
    }
    @DeleteMapping("/appeloffre/{id}")
    public void deleteAppelOffre(@PathVariable long id) {
        appelOffreRepository.deleteById(id);
    }

    @PostMapping("/appeloffre")
    public ResponseEntity<Object> createAppelOffre(@RequestBody AppelOffre appoff) {
        AppelOffre savedAppelOffre = appelOffreRepository.save(appoff);



        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedAppelOffre.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    @PutMapping("/appeloffre/{id}")
    public ResponseEntity<Object> updateAppelOffre(@RequestBody AppelOffre appoff, @PathVariable long id) {

        Optional<AppelOffre> appelOffreOptional = appelOffreRepository.findById(id);

        if (!appelOffreOptional.isPresent())
            return ResponseEntity.notFound().build();

        appoff.setId(id);

        appelOffreRepository.save(appoff);

        return ResponseEntity.ok().build();
    }
    @GetMapping("/appeloffrebyidstructure/{id}")
    public List<AppelOffre> findAllByIdStructure(@PathVariable long id)  throws AppelOffreNotFoundException {
        List<AppelOffre> appeloffre = appelOffreRepository.findAllByIdStructure(id);

        if (appeloffre.isEmpty())
            throw new AppelOffreNotFoundException("id-" + id);

        return (List<AppelOffre>) appeloffre;
    }
    @GetMapping("/appeloffrebyidprojet/{id}")
    public List<AppelOffre> findAllByIdProjet(@PathVariable long id)  throws AppelOffreNotFoundException {
        List<AppelOffre> appeloffre = appelOffreRepository.findAllByIdProjet(id);
        if (appeloffre.isEmpty())
            throw new AppelOffreNotFoundException("id-" + id);
        return (List<AppelOffre>) appeloffre;
    }

    }
