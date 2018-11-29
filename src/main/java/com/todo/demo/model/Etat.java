package com.todo.demo.model;

import javax.persistence.*;

@Entity
public class Etat {

    @GeneratedValue
    @Id
    private int id;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private String user;

    public Etat() {}

    public Etat(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
