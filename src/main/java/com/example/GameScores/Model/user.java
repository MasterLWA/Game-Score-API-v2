package com.example.GameScores.Model;

import jakarta.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "users")
public class user{
    //id,name,description
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getname() {
        return username;
    }

    public void setDescription(String email) {
        this.email = email;
    }

    public String getDescription() {
        return email;
    }

}
