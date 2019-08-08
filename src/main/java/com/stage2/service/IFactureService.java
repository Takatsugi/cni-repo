package com.stage2.service;

import com.stage2.entities.Facture;
import com.stage2.entities.Marche;
import com.stage2.exceptions.FactureNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IFactureService {
    public List<Facture> retrieveAllFacture();
    public Facture retrieveFactureById(@PathVariable long id) throws FactureNotFoundException;
    public List<Facture> findAllByMarche_Id(@PathVariable long id) throws FactureNotFoundException;
    public void deleteFacture(@PathVariable long id);
    public ResponseEntity<Object> createFacture(@RequestBody Facture facture);
    public ResponseEntity<Object> updateFacture(@RequestBody Facture facture, @PathVariable long id);

}
