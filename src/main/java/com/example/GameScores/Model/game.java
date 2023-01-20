package com.example.GameScores.Model;

import jakarta.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "game")
public class game {
    //id,name,description
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
