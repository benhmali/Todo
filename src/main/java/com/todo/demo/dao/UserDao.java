package com.todo.demo.dao;

import com.todo.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, String> {

    @Query("SELECT prenom, role FROM User u WHERE u.prenom = :prenom")
    User getUserByPrenom(@Param("prenom") String prenom);

}
