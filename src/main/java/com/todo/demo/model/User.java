package com.todo.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @GeneratedValue
    @Id
    private int id;

    private String prenom;

    private String role;

    public User() {}

    public User(String prenom, String role) {
        this.prenom = prenom;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
