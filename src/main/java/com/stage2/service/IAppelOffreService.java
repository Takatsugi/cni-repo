package com.stage2.service;

import com.stage2.entities.AppelOffre;
import com.stage2.exceptions.AppelOffreNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IAppelOffreService {
    public List<AppelOffre> retrieveAllAppelOffre() ;
    public AppelOffre retrieveAppelOffre(@PathVariable long id) throws AppelOffreNotFoundException;
    public void deleteAppelOffre(@PathVariable long id);
    public ResponseEntity<Object> createAppelOffre(@RequestBody AppelOffre appoff);
    public ResponseEntity<Object> updateAppelOffre(@RequestBody AppelOffre appoff, @PathVariable long id);
    public List<AppelOffre> findAllByIdStructure(@PathVariable long id) throws AppelOffreNotFoundException;
    public List<AppelOffre> findAllByIdProjet(@PathVariable long id) throws AppelOffreNotFoundException;
}
