package com.stage2.controller;

import com.stage2.dao.AppelOffreRepository;
import com.stage2.entities.AppelOffre;
import com.stage2.exceptions.AppelOffreNotFoundException;
import com.stage2.service.IAppelOffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class AppelOffreResource {
    @Autowired
    private IAppelOffreService iAppelOffreService;


    @GetMapping("/appeloffre")
    public List<AppelOffre> retrieveAllAppelOffre() {

        return iAppelOffreService.retrieveAllAppelOffre();
    }

    @GetMapping("/appeloffre/{id}")
    public AppelOffre retrieveAppelOffre(@PathVariable long id) throws AppelOffreNotFoundException {

    return iAppelOffreService.retrieveAppelOffre(id);
    }
    @DeleteMapping("/appeloffre/{id}")
    public void deleteAppelOffre(@PathVariable long id) {
    iAppelOffreService.deleteAppelOffre(id);
    }

    @PostMapping("/appeloffre")
    public ResponseEntity<Object> createAppelOffre(@RequestBody AppelOffre appoff) {
        return iAppelOffreService.createAppelOffre(appoff);
    }
    @PutMapping("/appeloffre/{id}")
    public ResponseEntity<Object> updateAppelOffre(@RequestBody AppelOffre appoff, @PathVariable long id) {

        return iAppelOffreService.updateAppelOffre(appoff, id);
    }
    @GetMapping("/appeloffrebyidstructure/{id}")
    public List<AppelOffre> findAllByIdStructure(@PathVariable long id)  throws AppelOffreNotFoundException {
        return iAppelOffreService.findAllByIdStructure(id);
    }
    @GetMapping("/appeloffrebyidprojet/{id}")
    public List<AppelOffre> findAllByIdProjet(@PathVariable long id)  throws AppelOffreNotFoundException {
        return iAppelOffreService.findAllByIdProjet(id);
    }

    }
