package com.stage2.service;

import com.stage2.entities.Structure;
import com.stage2.exceptions.StructureNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IStructureService {
    public List<Structure> retrieveAllStructure();
    public Structure retrieveStructure(@PathVariable long id) throws StructureNotFoundException;
    public void deleteStructure(@PathVariable long id);
    public ResponseEntity<Object> createStructure(@RequestBody Structure structure);
    public ResponseEntity<Object> updateStructure(@RequestBody Structure structure, @PathVariable long id);
}
