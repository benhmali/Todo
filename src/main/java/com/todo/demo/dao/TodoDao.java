package com.todo.demo.dao;

import com.todo.demo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoDao extends JpaRepository<Todo, Integer> {


}
