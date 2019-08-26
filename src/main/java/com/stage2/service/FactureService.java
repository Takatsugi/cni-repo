package com.stage2.service;

import com.stage2.dao.FactureRepository;
import com.stage2.dao.MarcheRepository;
import com.stage2.entities.AppelOffre;
import com.stage2.entities.Facture;
import com.stage2.entities.Marche;
import com.stage2.exceptions.AppelOffreNotFoundException;
import com.stage2.exceptions.FactureNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class FactureService implements IFactureService {
    @Autowired
    private FactureRepository factureRepository;
    @Autowired
    private MarcheRepository marcheRepository;

    @Override
    public List<Facture> retrieveAllFacture() {
        return (List<Facture>) factureRepository.findAll();
    }

    @Override
    public Facture retrieveFactureById(@PathVariable long id) throws FactureNotFoundException {
        Optional<Facture> facture = factureRepository.findById(id);

        if (!facture.isPresent())
            throw new FactureNotFoundException("id-" + id);

        return facture.get();
    }

    @Override
    public List<Facture> findAllByMarche_Id(@PathVariable long id)  throws FactureNotFoundException {
        List<Facture> factures = factureRepository.findAllByMarche_Id(id);

        if (factures.isEmpty())
            throw new FactureNotFoundException("id-" + id);

        return (List<Facture>) factures;
    }

    @Override
    public void deleteFacture(@PathVariable long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<Object> createFacture(@RequestBody Facture facture) {
        Optional<Marche> p = marcheRepository.findById(facture.getMarche().getId());
        facture.setIdStructure(p.get().getIdStructure());
        facture.setIdProjet(p.get().getIdProjet());
        facture.setIdAo(p.get().getAppelOffre().getId());
        Facture savedFacture = factureRepository.save(facture);



        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedFacture.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

    @Override
    public ResponseEntity<Object> updateFacture(@RequestBody Facture facture, @PathVariable long id) {

        Optional<Facture> factureOptional = factureRepository.findById(id);

        if (!factureOptional.isPresent())
            return ResponseEntity.notFound().build();

        facture.setId(id);

        factureRepository.save(facture);

        return ResponseEntity.ok().build();
    }
}
