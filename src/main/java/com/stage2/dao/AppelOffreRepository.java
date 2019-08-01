package com.stage2.dao;

import com.stage2.entities.AppelOffre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface AppelOffreRepository extends CrudRepository<AppelOffre,Long> {
    List<AppelOffre> findAllByIdStructure(long id_structure);
    List<AppelOffre> findAllByIdProjet(long id_projet);

}
