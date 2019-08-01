package com.stage2.dao;

import com.stage2.entities.Marche;
import com.stage2.entities.MarcheLot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource

public interface MarcheLotRepository extends CrudRepository<MarcheLot,Long> {
    List<MarcheLot> findAllByMarche_Id(Long id_marche);

}
