package com.stage2.service;

import com.stage2.dao.AppelOffreRepository;
import com.stage2.dao.MarcheRepository;
import com.stage2.dao.ProjetRepository;
import com.stage2.entities.AppelOffre;
import com.stage2.entities.Marche;
import com.stage2.entities.Projet;
import com.stage2.exceptions.AppelOffreNotFoundException;
import com.stage2.exceptions.MarcheNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class MarcheService implements IMarcheService {
    @Autowired
    private MarcheRepository marcheRepository;
    @Autowired
    private AppelOffreRepository appelOffreRepository;
    @Autowired
    private ProjetRepository projetRepository;

    @Override
    public List<Marche> retrieveAllMarche() {

        return (List<Marche>) marcheRepository.findAll();
    }

    @Override
    public Marche retrieveMarche(@PathVariable long id) throws MarcheNotFoundException {
        Optional<Marche> marche = marcheRepository.findById(id);

        if (!marche.isPresent())
            throw new MarcheNotFoundException("id-" + id);

        return marche.get();
    }
    @Override
    public void deleteMarche(@PathVariable long id) {
        marcheRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<Object> createMarche(@RequestBody Marche marche) {
        Optional<AppelOffre> p = appelOffreRepository.findById(marche.getAppelOffre().getId());
        marche.setIdStructure(p.get().getIdStructure());
        marche.setIdProjet(p.get().getProjet().getId());

        Marche savedMarche = marcheRepository.save(marche);



        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedMarche.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    @Override
    public ResponseEntity<Object> updateMarche(@RequestBody Marche marche, @PathVariable long id) {

        Optional<Marche> marcheOptional = marcheRepository.findById(id);

        if (!marcheOptional.isPresent())
            return ResponseEntity.notFound().build();

        marche.setId(id);

        marcheRepository.save(marche);

        return ResponseEntity.ok().build();
    }

    @Override
    public List<Marche> findAllByIdStructure(@PathVariable long id)  throws MarcheNotFoundException {
        List<Marche> marches = marcheRepository.findAllByIdStructure(id);

        if (marches.isEmpty())
            throw new MarcheNotFoundException("id-" + id);

        return (List<Marche>) marches;
    }
    @Override
    public List<Marche> findAllByIdProjet(@PathVariable long id)  throws MarcheNotFoundException {
        List<Marche> marches = marcheRepository.findAllByIdProjet(id);
        if (marches.isEmpty())
            throw new MarcheNotFoundException("id-" + id);
        return (List<Marche>) marches;
    }
    @Override
    public List<Marche> findAllByAppelOffre(@PathVariable long id) throws MarcheNotFoundException, AppelOffreNotFoundException {
        Optional<AppelOffre> ao = appelOffreRepository.findById(id);
        List<Marche> marches = marcheRepository.findAllByAppelOffre_Id(ao.get().getId());
        if (marches.isEmpty())
            throw new MarcheNotFoundException("id-" + id);
        return (List<Marche>) marches;
    }
}
