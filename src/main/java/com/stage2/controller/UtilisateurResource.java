package com.stage2.controller;

import com.stage2.entities.Structure;
import com.stage2.entities.Utilisateur;
import com.stage2.entities.UtilisateurPK;
import com.stage2.exceptions.StructureNotFoundException;
import com.stage2.exceptions.UserNotFoundException;
import com.stage2.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UtilisateurResource {
    @Autowired
    private IUtilisateurService iUtilisateurService;

    @GetMapping("/user")
    public List<Utilisateur> retrieveAllUsers() {

        return iUtilisateurService.retrieveAllUsers();
    }

    @GetMapping("/user/{id}")
    public Utilisateur retrieveStructure(@PathVariable UtilisateurPK id) throws UserNotFoundException {
        return iUtilisateurService.retrieveUser(id);
    }
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable UtilisateurPK id) {
        iUtilisateurService.deleteUser(id);
    }

    @PostMapping("/user")
    public ResponseEntity<Object> createUser(@RequestBody Utilisateur utilisateur) {
        return iUtilisateurService.createUser(utilisateur);

    }
    @PutMapping("/user/{id}")
    public ResponseEntity<Object> updateUser(@RequestBody Utilisateur utilisateur, @PathVariable UtilisateurPK id) {

        return iUtilisateurService.updateUser(utilisateur, id);
    }
}
