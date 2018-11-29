package com.todo.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private int id;

    private String titre;
    private String desciption;
    private String etat;
    private int id_user;

    public Todo() {}

    public Todo(String titre, String desciption, String etat, int id_user) {
        this.titre = titre;
        this.desciption = desciption;
        this.etat = etat;
        this.id_user = id_user;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDesciption() {
        return desciption;
    }

    public String getEtat() {
        return etat;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
}
