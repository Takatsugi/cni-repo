package com.stage2.service;

import com.stage2.dao.AppelOffreRepository;
import com.stage2.entities.AppelOffre;
import com.stage2.exceptions.AppelOffreNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class AppelOffreService implements IAppelOffreService{

    @Autowired
    private AppelOffreRepository appelOffreRepository;


    @Override
    public List<AppelOffre> retrieveAllAppelOffre() {
        return (List<AppelOffre>) appelOffreRepository.findAll();
    }

    @Override
    public AppelOffre retrieveAppelOffre(@PathVariable long id) throws AppelOffreNotFoundException {
        Optional<AppelOffre> appeloffre = appelOffreRepository.findById(id);

        if (!appeloffre.isPresent())
            throw new AppelOffreNotFoundException("id-" + id);

        return appeloffre.get();
    }
    @Override
    public void deleteAppelOffre(@PathVariable long id) {
        appelOffreRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<Object> createAppelOffre(@RequestBody AppelOffre appoff) {
        AppelOffre savedAppelOffre = appelOffreRepository.save(appoff);



        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedAppelOffre.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    @Override
    public ResponseEntity<Object> updateAppelOffre(@RequestBody AppelOffre appoff, @PathVariable long id) {

        Optional<AppelOffre> appelOffreOptional = appelOffreRepository.findById(id);

        if (!appelOffreOptional.isPresent())
            return ResponseEntity.notFound().build();

        appoff.setId(id);

        appelOffreRepository.save(appoff);

        return ResponseEntity.ok().build();
    }
    @Override
    public List<AppelOffre> findAllByIdStructure(@PathVariable long id)  throws AppelOffreNotFoundException {
        List<AppelOffre> appeloffre = appelOffreRepository.findAllByIdStructure(id);

        if (appeloffre.isEmpty())
            throw new AppelOffreNotFoundException("id-" + id);

        return (List<AppelOffre>) appeloffre;
    }
    @Override
    public List<AppelOffre> findAllByIdProjet(@PathVariable long id)  throws AppelOffreNotFoundException {
        List<AppelOffre> appeloffre = appelOffreRepository.findAllByProjet_Id(id);
        if (appeloffre.isEmpty())
            throw new AppelOffreNotFoundException("id-" + id);
        return (List<AppelOffre>) appeloffre;
    }
}
