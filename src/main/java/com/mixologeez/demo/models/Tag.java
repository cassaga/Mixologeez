package com.mixologeez.demo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "TAG")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tag_id;

    @Column(name = "tag_name")
    public String tag_name;

    @OneToMany(mappedBy = "tag1")
    private List<Cocktail> cocktails1;

    @OneToMany(mappedBy = "tag2")
    private List<Cocktail> cocktails2;

    @OneToMany(mappedBy = "tag3")
    private List<Cocktail> cocktails3;
}
