package com.stage2.dao;

import com.stage2.entities.Facture;
import com.stage2.entities.Marche;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RepositoryRestResource

public interface FactureRepository extends CrudRepository<Facture,Long> {
    List<Facture> findAllByMarche_Id(@PathVariable long id);
}
