package com.stage2.service;

import com.stage2.dao.UtilisateurRepository;
import com.stage2.entities.Utilisateur;
import com.stage2.entities.UtilisateurPK;
import com.stage2.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService implements IUtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Override
    public List<Utilisateur> retrieveAllUsers() {
        return (List<Utilisateur>) utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur retrieveUser(@PathVariable UtilisateurPK id) throws UserNotFoundException {
        Optional<Utilisateur> utilisateur = utilisateurRepository.findById(id);

        if (!utilisateur.isPresent())
            throw new UserNotFoundException("id-" + id);

        return utilisateur.get();    }

    @Override
    public void deleteUser(@PathVariable UtilisateurPK id) {
        utilisateurRepository.deleteById(id);

    }

    @Override
    public ResponseEntity<Object> createUser(@RequestBody Utilisateur utilisateur) {
        Utilisateur savedUser = utilisateurRepository.save(utilisateur);



        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();    }

    @Override
    public ResponseEntity<Object> updateUser(@RequestBody Utilisateur utilisateur, UtilisateurPK id) {
        Optional<Utilisateur> utilisateurOptional = utilisateurRepository.findById(id);

        if (!utilisateurOptional.isPresent())
            return ResponseEntity.notFound().build();

        utilisateur.setId(id);

        utilisateurRepository.save(utilisateur);

        return ResponseEntity.ok().build();    }
}
