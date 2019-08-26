package com.stage2.service;

import com.stage2.entities.Utilisateur;
import com.stage2.entities.UtilisateurPK;
import com.stage2.exceptions.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IUtilisateurService {
    public List<Utilisateur> retrieveAllUsers();
    public Utilisateur retrieveUser(@PathVariable UtilisateurPK id) throws UserNotFoundException;
    public void deleteUser(@PathVariable UtilisateurPK id);
    public ResponseEntity<Object> createUser(@RequestBody Utilisateur utilisateur);
    public ResponseEntity<Object> updateUser(@RequestBody Utilisateur utilisateur, @PathVariable UtilisateurPK id);
}
