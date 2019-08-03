package com.stage2.controller;

import com.stage2.dao.StructureRepository;
import com.stage2.entities.Structure;
import com.stage2.exceptions.StructureNotFoundException;
import com.stage2.service.IStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class StructureResource {
    @Autowired
    private IStructureService iStructureService;

    @GetMapping("/structure")
    public List<Structure> retrieveAllStructure() {

        return iStructureService.retrieveAllStructure();
    }

    @GetMapping("/structure/{id}")
    public Structure retrieveStructure(@PathVariable long id) throws StructureNotFoundException {
        return iStructureService.retrieveStructure(id);
    }
    @DeleteMapping("/structure/{id}")
    public void deleteStructure(@PathVariable long id) {
        iStructureService.deleteStructure(id);
    }

    @PostMapping("/structure")
    public ResponseEntity<Object> createStructure(@RequestBody Structure structure) {
        return iStructureService.createStructure(structure);

    }
    @PutMapping("/structure/{id}")
    public ResponseEntity<Object> updateStructure(@RequestBody Structure structure, @PathVariable long id) {

        return iStructureService.updateStructure(structure, id);
    }
}
