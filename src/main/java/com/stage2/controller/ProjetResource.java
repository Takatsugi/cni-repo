package com.stage2.controller;

import com.stage2.dao.ProjetRepository;
import com.stage2.entities.Projet;
import com.stage2.exceptions.ProjetNotFoundException;
import com.stage2.service.IProjetService;
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
    private IProjetService iProjetService;

    @GetMapping("/projet")
    public List<Projet> retrieveAllProjet() {

        return iProjetService.retrieveAllProjet();
    }

    @GetMapping("/projet/{id}")
    public Projet retrieveProjet(@PathVariable long id) throws ProjetNotFoundException {
        return iProjetService.retrieveProjet(id);
    }
    @DeleteMapping("/projet/{id}")
    public void deleteProjet(@PathVariable long id) {
        iProjetService.deleteProjet(id);
    }

    @PostMapping("/projet")
    public ResponseEntity<Object> createProjet(@RequestBody Projet projet) {
        return iProjetService.createProjet(projet);

    }
    @PutMapping("/projet/{id}")
    public ResponseEntity<Object> updateProjet(@RequestBody Projet projet, @PathVariable long id) {

        return iProjetService.updateProjet(projet, id);
    }
}
