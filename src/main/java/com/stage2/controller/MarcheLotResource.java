package com.stage2.controller;

import com.stage2.dao.MarcheLotRepository;
import com.stage2.dao.MarcheRepository;
import com.stage2.entities.Marche;
import com.stage2.entities.MarcheLot;
import com.stage2.exceptions.MarcheLotNotFoundException;
import com.stage2.service.IMarcheLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController

public class MarcheLotResource {
    @Autowired
    private IMarcheLotService iMarcheLotService;


    @GetMapping("/marchelot")
    public List<MarcheLot> retrieveAllMarcheLot() {
        return iMarcheLotService.retrieveAllMarcheLot();
    }

    @GetMapping("/marchelot/{id}")
    public MarcheLot retrieveMarche(@PathVariable long id) throws MarcheLotNotFoundException {
        return iMarcheLotService.retrieveMarche(id);
    }
    @DeleteMapping("/marchelot/{id}")
    public void deleteMarcheLot(@PathVariable long id) {
         iMarcheLotService.deleteMarcheLot(id);
    }

    @PostMapping("/marchelot")
    public ResponseEntity<Object> createMarcheLot(@RequestBody MarcheLot marlot) {
        return iMarcheLotService.createMarcheLot(marlot);

    }
    @PutMapping("/marchelot/{id}")
    public ResponseEntity<Object> updateMarcheLot(@RequestBody MarcheLot marlot, @PathVariable long id) {

        return iMarcheLotService.updateMarcheLot(marlot, id);
    }
    @GetMapping("/marchelotbyidmarche/{id}")
    public List<MarcheLot> findAllByMarche_Id(@PathVariable long id)  throws MarcheLotNotFoundException {
        return iMarcheLotService.findAllByMarche_Id(id);
    }
}
