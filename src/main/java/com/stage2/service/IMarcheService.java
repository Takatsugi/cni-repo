package com.stage2.service;

import com.stage2.entities.Marche;
import com.stage2.exceptions.AppelOffreNotFoundException;
import com.stage2.exceptions.MarcheNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IMarcheService {
    public List<Marche> retrieveAllMarche();
    public Marche retrieveMarche(@PathVariable long id) throws MarcheNotFoundException;
    public void deleteMarche(@PathVariable long id);
    public ResponseEntity<Object> createMarche(@RequestBody Marche marche);
    public ResponseEntity<Object> updateMarche(@RequestBody Marche marche, @PathVariable long id);
    public List<Marche> findAllByIdStructure(@PathVariable long id) throws MarcheNotFoundException;
    public List<Marche> findAllByIdProjet(@PathVariable long id) throws MarcheNotFoundException;
    public List<Marche> findAllByAppelOffre(@PathVariable long id) throws MarcheNotFoundException, AppelOffreNotFoundException;
}
