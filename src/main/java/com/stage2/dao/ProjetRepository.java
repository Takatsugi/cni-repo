package com.stage2.dao;

import com.stage2.entities.Projet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface ProjetRepository extends CrudRepository<Projet,Long> {
}
