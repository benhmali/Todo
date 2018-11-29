package com.todo.demo.controller;

import com.todo.demo.dao.TodoDao;
import com.todo.demo.model.Todo;
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
public class TodoController {

    @Autowired
    private TodoDao todoDao;

    //Todos
    @PostMapping(value = "/Todo")
    public ResponseEntity<Void> addTodo(@Valid @RequestBody Todo todo){

        Todo todo1 = todoDao.save(todo);
        if (todo1 == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(todo1.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
