package com.stage2.controller;

import com.stage2.dao.StructureRepository;
import com.stage2.entities.Structure;
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
    private StructureRepository structureRepository;

    @GetMapping("/structure")
    public List<Structure> retrieveAllStructure() {

        return (List<Structure>) structureRepository.findAll();
    }

    @GetMapping("/structure/{id}")
    public Structure retrieveStructure(@PathVariable long id) throws StructureNotFoundException {
        Optional<Structure> structure = structureRepository.findById(id);

        if (!structure.isPresent())
            throw new StructureNotFoundException("id-" + id);

        return structure.get();
    }
    @DeleteMapping("/structure/{id}")
    public void deleteStructure(@PathVariable long id) {
        structureRepository.deleteById(id);
    }

    @PostMapping("/structure")
    public ResponseEntity<Object> createStructure(@RequestBody Structure structure) {
        Structure savedStructure = structureRepository.save(structure);



        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedStructure.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    @PutMapping("/structure/{id}")
    public ResponseEntity<Object> updateStructure(@RequestBody Structure structure, @PathVariable long id) {

        Optional<Structure> structureOptional = structureRepository.findById(id);

        if (!structureOptional.isPresent())
            return ResponseEntity.notFound().build();

        structure.setId(id);

        structureRepository.save(structure);

        return ResponseEntity.ok().build();
    }
}
