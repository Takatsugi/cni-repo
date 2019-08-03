package com.stage2.service;

import com.stage2.exceptions.AoLotNotFoundException;
import com.stage2.dao.AoLotRepository;
import com.stage2.dao.AppelOffreRepository;
import com.stage2.entities.AoLot;
import com.stage2.entities.AppelOffre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class AoLotService implements IAoLotService {
    @Autowired
    private AoLotRepository aoLotRepository;
    @Autowired
    private AppelOffreRepository appelOffreRepository;

    @Override
    public List<AoLot> retrieveAllAoLot() {
        return (List<AoLot>) aoLotRepository.findAll();
    }
    @Override
    public AoLot retrieveMarche(@PathVariable long id) throws AoLotNotFoundException {
        Optional<AoLot> aolot = aoLotRepository.findById(id);

        if (!aolot.isPresent())
            throw new AoLotNotFoundException("id-" + id);

        return aolot.get();
    }
    @Override
    public void deleteAoLot(@PathVariable long id) {
        aoLotRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<Object> createAoLot(@RequestBody AoLot aolot) {
        AoLot savedAoLot = aoLotRepository.save(aolot);



        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedAoLot.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    @Override
    public ResponseEntity<Object> updateAoLot(@RequestBody AoLot aolot, @PathVariable long id) {

        Optional<AoLot> aoLotOptional = aoLotRepository.findById(id);

        if (!aoLotOptional.isPresent())
            return ResponseEntity.notFound().build();

        aolot.setId(id);

        aoLotRepository.save(aolot);

        return ResponseEntity.ok().build();
    }
    @Override
    public List<AoLot> findAllByAppelOffre(@PathVariable long id)  throws AoLotNotFoundException {
        Optional<AppelOffre> ao = appelOffreRepository.findById(id);
        List<AoLot> aoLots = aoLotRepository.findAllByAppelOffre(ao);
        if (aoLots.isEmpty())
            throw new AoLotNotFoundException("id-" + id);
        return (List<AoLot>) aoLots;
    }
}
