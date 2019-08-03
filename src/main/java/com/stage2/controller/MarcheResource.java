package com.stage2.controller;

import com.stage2.dao.AppelOffreRepository;
import com.stage2.dao.MarcheRepository;
import com.stage2.entities.AppelOffre;
import com.stage2.entities.Marche;
import com.stage2.exceptions.AppelOffreNotFoundException;
import com.stage2.exceptions.MarcheNotFoundException;
import com.stage2.service.IMarcheService;
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
    private IMarcheService iMarcheService;

    @GetMapping("/marche")
    public List<Marche> retrieveAllMarche() {

        return iMarcheService.retrieveAllMarche();
    }

    @GetMapping("/marche/{id}")
    public Marche retrieveMarche(@PathVariable long id) throws MarcheNotFoundException {
        return iMarcheService.retrieveMarche(id);
    }
    @DeleteMapping("/marche/{id}")
    public void deleteMarche(@PathVariable long id) {
        iMarcheService.deleteMarche(id);
    }

    @PostMapping("/marche")
    public ResponseEntity<Object> createMarche(@RequestBody Marche marche) {
        return iMarcheService.createMarche(marche);

    }
    @PutMapping("/marche/{id}")
    public ResponseEntity<Object> updateMarche(@RequestBody Marche marche, @PathVariable long id) {

        return iMarcheService.updateMarche(marche, id);
    }

    @GetMapping("/marchebyidstructure/{id}")
    public List<Marche> findAllByIdStructure(@PathVariable long id)  throws MarcheNotFoundException {
        return iMarcheService.findAllByIdStructure(id);
    }
    @GetMapping("/marchebyidprojet/{id}")
    public List<Marche> findAllByIdProjet(@PathVariable long id)  throws MarcheNotFoundException {
        return iMarcheService.findAllByIdProjet(id);
    }
    @GetMapping("/marchebyidao/{id}")
    public List<Marche> findAllByAppelOffre(@PathVariable long id) throws MarcheNotFoundException, AppelOffreNotFoundException {
        return iMarcheService.findAllByAppelOffre(id);
    }
}
