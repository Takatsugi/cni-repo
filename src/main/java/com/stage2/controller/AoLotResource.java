package com.stage2.controller;

import com.stage2.dao.AoLotRepository;
import com.stage2.dao.AppelOffreRepository;
import com.stage2.entities.AoLot;
import com.stage2.entities.AppelOffre;
import com.stage2.exceptions.AoLotNotFoundException;
import com.stage2.service.IAoLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController

public class AoLotResource {

    @Autowired
    private IAoLotService iAoLotService;

    @GetMapping("/aolot")
    public List<AoLot> retrieveAllAoLot() {
    return iAoLotService.retrieveAllAoLot();
    }

    @GetMapping("/aolot/{id}")
    public AoLot retrieveMarche(@PathVariable long id) throws AoLotNotFoundException {
        return iAoLotService.retrieveMarche(id);
    }
    @DeleteMapping("/aolot/{id}")
    public void deleteAoLot(@PathVariable long id) {
    iAoLotService.deleteAoLot(id);
    }

    @PostMapping("/aolot")
    public ResponseEntity<Object> createAoLot(@RequestBody AoLot aolot) {
      return  iAoLotService.createAoLot(aolot);

    }
    @PutMapping("/aolot/{id}")
    public ResponseEntity<Object> updateAoLot(@RequestBody AoLot aolot, @PathVariable long id) {

      return   iAoLotService.updateAoLot(aolot, id);
    }

    @GetMapping("/aolotbyidao/{id}")
    public List<AoLot> findAllByAppelOffre(@PathVariable long id) throws AoLotNotFoundException {
      return   iAoLotService.findAllByAppelOffre(id);
    }
}
