package com.stage2.dao;

import com.stage2.entities.AppelOffre;
import com.stage2.entities.Marche;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource

public interface MarcheRepository extends CrudRepository<Marche,Long> {
    List<Marche> findAllByIdStructure(long id_structure);
    List<Marche> findAllByIdProjet(long id_projet);
    List<Marche> findAllByAppelOffre_Id(Long ao);



}
