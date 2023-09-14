package com.mixologeez.demo.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name= "TAG")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    private Long tagId;

    @Column(name = "tag_name")
    private String tagName;

    @OneToMany(mappedBy = "tag1")
    private List<Cocktail> cocktails1;

    @OneToMany(mappedBy = "tag2")
    private List<Cocktail> cocktails2;

    @OneToMany(mappedBy = "tag3")
    private List<Cocktail> cocktails3;

    public Tag() {}

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<Cocktail> getCocktails1() {
        return cocktails1;
    }

    public void setCocktails1(List<Cocktail> cocktails1) {
        this.cocktails1 = cocktails1;
    }

    public List<Cocktail> getCocktails2() {
        return cocktails2;
    }

    public void setCocktails2(List<Cocktail> cocktails2) {
        this.cocktails2 = cocktails2;
    }

    public List<Cocktail> getCocktails3() {
        return cocktails3;
    }

    public void setCocktails3(List<Cocktail> cocktails3) {
        this.cocktails3 = cocktails3;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagId=" + tagId +
                ", tagName='" + tagName + '\'' +
                ", cocktails1=" + cocktails1 +
                ", cocktails2=" + cocktails2 +
                ", cocktails3=" + cocktails3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(tagId, tag.tagId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId);
    }
}
