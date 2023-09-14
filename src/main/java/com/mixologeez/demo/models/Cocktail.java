package com.mixologeez.demo.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name= "COCKTAIL")
public class Cocktail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cocktail_id")
    private int cocktailId;

    @Column(name = "cocktail_name")
    public String cocktailName;

    @Column(name = "cocktail_image")
    public String cocktailImage;

    @Column(name = "cocktail_description")
    public String cocktailDescription;

    @Column(name = "cocktail_instruction")
    public String cocktailInstruction;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_1")
    private Tag tag1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_2")
    private Tag tag2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_3")
    private Tag tag3;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country")
    private Country country;

    public Cocktail() {}

    public int getCocktailId() {
        return cocktailId;
    }

    public void setCocktailId(int cocktailId) {
        this.cocktailId = cocktailId;
    }

    public String getCocktailName() {
        return cocktailName;
    }

    public void setCocktailName(String cocktailName) {
        this.cocktailName = cocktailName;
    }

    public String getCocktailImage() {
        return cocktailImage;
    }

    public void setCocktailImage(String cocktailImage) {
        this.cocktailImage = cocktailImage;
    }

    public String getCocktailDescription() {
        return cocktailDescription;
    }

    public void setCocktailDescription(String cocktailDescription) {
        this.cocktailDescription = cocktailDescription;
    }

    public String getCocktailInstruction() {
        return cocktailInstruction;
    }

    public void setCocktailInstruction(String cocktailInstruction) {
        this.cocktailInstruction = cocktailInstruction;
    }

    public Tag getTag1() {
        return tag1;
    }

    public void setTag1(Tag tag1) {
        this.tag1 = tag1;
    }

    public Tag getTag2() {
        return tag2;
    }

    public void setTag2(Tag tag2) {
        this.tag2 = tag2;
    }

    public Tag getTag3() {
        return tag3;
    }

    public void setTag3(Tag tag3) {
        this.tag3 = tag3;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "cocktailId=" + cocktailId +
                ", cocktailName='" + cocktailName + '\'' +
                ", cocktailImage='" + cocktailImage + '\'' +
                ", cocktailDescription='" + cocktailDescription + '\'' +
                ", cocktailInstruction='" + cocktailInstruction + '\'' +
                ", tag1=" + tag1 +
                ", tag2=" + tag2 +
                ", tag3=" + tag3 +
                ", country=" + country +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cocktail cocktail = (Cocktail) o;
        return Objects.equals(cocktailId, cocktail.cocktailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cocktailId);
    }
}
