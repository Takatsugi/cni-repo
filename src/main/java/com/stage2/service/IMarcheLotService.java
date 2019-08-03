package com.stage2.service;

import com.stage2.entities.MarcheLot;
import com.stage2.exceptions.MarcheLotNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IMarcheLotService {
    public List<MarcheLot> retrieveAllMarcheLot();
    public MarcheLot retrieveMarche(@PathVariable long id) throws MarcheLotNotFoundException;
    public void deleteMarcheLot(@PathVariable long id);
    public ResponseEntity<Object> createMarcheLot(@RequestBody MarcheLot marlot);
    public ResponseEntity<Object> updateMarcheLot(@RequestBody MarcheLot marlot, @PathVariable long id);
    public List<MarcheLot> findAllByMarche_Id(@PathVariable long id) throws MarcheLotNotFoundException;
}
