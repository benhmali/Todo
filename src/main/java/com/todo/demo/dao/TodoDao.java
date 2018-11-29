package com.todo.demo.dao;

import com.todo.demo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodoDao extends JpaRepository<Todo, Integer> {

    @Query("SELECT id, etat, titre FROM Todo t WHERE t.id_user = :id")
    List<Todo> getTodosByUser(@Param("id") String id);


    List<Todo> findByUser(String id);
}
