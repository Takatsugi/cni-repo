package com.stage2.service;

import com.stage2.entities.Projet;
import com.stage2.exceptions.ProjetNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IProjetService {
    public List<Projet> retrieveAllProjet();
    public Projet retrieveProjet(@PathVariable long id) throws ProjetNotFoundException;
    public void deleteProjet(@PathVariable long id);
    public ResponseEntity<Object> createProjet(@RequestBody Projet projet);
    public ResponseEntity<Object> updateProjet(@RequestBody Projet projet, @PathVariable long id);
}
