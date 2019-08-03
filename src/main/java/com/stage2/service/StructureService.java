package com.stage2.service;

import com.stage2.dao.StructureRepository;
import com.stage2.entities.Structure;
import com.stage2.exceptions.StructureNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class StructureService implements IStructureService {
    @Autowired
    private StructureRepository structureRepository;

    @Override
    public List<Structure> retrieveAllStructure() {

        return (List<Structure>) structureRepository.findAll();
    }

    @Override
    public Structure retrieveStructure(@PathVariable long id) throws StructureNotFoundException {
        Optional<Structure> structure = structureRepository.findById(id);

        if (!structure.isPresent())
            throw new StructureNotFoundException("id-" + id);

        return structure.get();
    }
    @Override
    public void deleteStructure(@PathVariable long id) {
        structureRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<Object> createStructure(@RequestBody Structure structure) {
        Structure savedStructure = structureRepository.save(structure);



        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedStructure.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    @Override
    public ResponseEntity<Object> updateStructure(@RequestBody Structure structure, @PathVariable long id) {

        Optional<Structure> structureOptional = structureRepository.findById(id);

        if (!structureOptional.isPresent())
            return ResponseEntity.notFound().build();

        structure.setId(id);

        structureRepository.save(structure);

        return ResponseEntity.ok().build();
    }
}
