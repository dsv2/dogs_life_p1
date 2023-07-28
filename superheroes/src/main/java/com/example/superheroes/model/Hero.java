package com.example.superheroes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "heroes")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String alias;
    private String superpower;
    private int teamid;
}
