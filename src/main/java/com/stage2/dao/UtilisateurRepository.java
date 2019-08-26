package com.stage2.dao;

import com.stage2.entities.Utilisateur;
import com.stage2.entities.UtilisateurPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UtilisateurRepository extends CrudRepository<Utilisateur, UtilisateurPK> {
}
