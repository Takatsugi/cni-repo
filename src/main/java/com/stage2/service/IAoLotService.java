package com.stage2.service;

import com.stage2.entities.AoLot;
import com.stage2.exceptions.AoLotNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
public interface IAoLotService  {
    public List<AoLot> retrieveAllAoLot();
    public AoLot retrieveMarche(@PathVariable long id) throws AoLotNotFoundException;
    public void deleteAoLot(@PathVariable long id);
    public ResponseEntity<Object> createAoLot(@RequestBody AoLot aolot);
    public ResponseEntity<Object> updateAoLot(@RequestBody AoLot aolot, @PathVariable long id);
    public List<AoLot> findAllByAppelOffre(@PathVariable long id) throws AoLotNotFoundException;
}
