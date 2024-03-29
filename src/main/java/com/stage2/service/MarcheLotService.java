package com.stage2.service;

import com.stage2.dao.MarcheLotRepository;
import com.stage2.dao.MarcheRepository;
import com.stage2.entities.Marche;
import com.stage2.entities.MarcheLot;
import com.stage2.exceptions.MarcheLotNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class MarcheLotService implements IMarcheLotService  {
    @Autowired
    private MarcheLotRepository marcheLotRepository;
    @Autowired
    private MarcheRepository marcheRepository;

    @Override
    public List<MarcheLot> retrieveAllMarcheLot() {
        return (List<MarcheLot>) marcheLotRepository.findAll();
    }

    @Override
    public MarcheLot retrieveMarche(@PathVariable long id) throws MarcheLotNotFoundException {
        Optional<MarcheLot> marchelot = marcheLotRepository.findById(id);

        if (!marchelot.isPresent())
            throw new MarcheLotNotFoundException("id-" + id);

        return marchelot.get();
    }
    @Override
    public void deleteMarcheLot(@PathVariable long id) {
        marcheLotRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<Object> createMarcheLot(@RequestBody MarcheLot marlot) {
        MarcheLot savedMarcheLot = marcheLotRepository.save(marlot);



        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedMarcheLot.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    @Override
    public ResponseEntity<Object> updateMarcheLot(@RequestBody MarcheLot marlot, @PathVariable long id) {

        Optional<MarcheLot> marcheLotOptional = marcheLotRepository.findById(id);

        if (!marcheLotOptional.isPresent())
            return ResponseEntity.notFound().build();

        marlot.setId(id);

        marcheLotRepository.save(marlot);

        return ResponseEntity.ok().build();
    }
    @Override
    public List<MarcheLot> findAllByMarche_Id(@PathVariable long id)  throws MarcheLotNotFoundException {
        Optional<Marche> m = marcheRepository.findById(id);
        List<MarcheLot> marcheLots = marcheLotRepository.findAllByMarche_Id(m.get().getId());
        if (marcheLots.isEmpty())
            throw new MarcheLotNotFoundException("id-" + id);
        return (List<MarcheLot>) marcheLots;
    }
}
