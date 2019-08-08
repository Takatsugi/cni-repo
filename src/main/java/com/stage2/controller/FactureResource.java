package com.stage2.controller;

import com.stage2.dao.FactureRepository;
import com.stage2.entities.Facture;
import com.stage2.exceptions.FactureNotFoundException;
import com.stage2.service.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FactureResource {
    @Autowired
    private IFactureService iFactureService;

    @GetMapping("/facture")
    public List<Facture> retrieveAllFacture() {

        return iFactureService.retrieveAllFacture();
    }

    @GetMapping("/facture/{id}")
    public Facture retrieveFacture(@PathVariable long id) throws FactureNotFoundException {

        return iFactureService.retrieveFactureById(id);
    }
    @DeleteMapping("/facture/{id}")
    public void deleteFacture(@PathVariable long id) {
        iFactureService.deleteFacture(id);
    }

    @PostMapping("/facture")
    public ResponseEntity<Object> createFacture(@RequestBody Facture facture) {
        return iFactureService.createFacture(facture);
    }
    @PutMapping("/facture/{id}")
    public ResponseEntity<Object> updateFacture(@RequestBody Facture facture, @PathVariable long id) {

        return iFactureService.updateFacture(facture, id);
    }
    @GetMapping("/facturebyidmarche/{id}")
    public List<Facture> getAllByMarche_Id(@PathVariable long id)  throws FactureNotFoundException {
        return iFactureService.findAllByMarche_Id(id);
    }

}
