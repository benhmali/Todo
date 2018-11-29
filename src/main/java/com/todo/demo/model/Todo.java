package com.todo.demo.model;

import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private int id;

    private String titre;
    private String desciption;
    private String etat;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Todo() {}

    public Todo(String titre, String desciption, String etat, User user) {
        this.titre = titre;
        this.desciption = desciption;
        this.etat = etat;
        this.user = user;
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

    public User getUser() {
        return user;
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

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", desciption='" + desciption + '\'' +
                ", etat='" + etat + '\'' +
                ", user=" + user +
                '}';
    }
}
