package com.stage2.dao;

import com.stage2.entities.Structure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface StructureRepository extends CrudRepository<Structure,Long> {
}
