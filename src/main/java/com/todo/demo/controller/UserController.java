package com.todo.demo.controller;

import com.todo.demo.dao.UserDao;
import com.todo.demo.model.User;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@Api(description = "Gestion des tâches")
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    //User
    @PostMapping(value = "/User")
    public ResponseEntity<Void> addUser(@Valid @RequestBody User user){

        User user1 = userDao.save(user);
        if (user1 == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user1.getPrenom())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
