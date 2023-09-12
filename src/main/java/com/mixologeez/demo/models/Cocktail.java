package com.mixologeez.demo.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name= "COCKTAIL")
public class Cocktail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cocktail_id;

    @Column(name = "cocktail_name")
    public String cocktail_name;

    @Column(name = "cocktail_image")
    public String cocktail_image;

    @Column(name = "cocktail_description")
    public String cocktail_description;

    @Column(name = "cocktail_instruction")
    public String cocktail_instruction;

    @ManyToOne
    @JoinColumn(name = "tag_1_id")
    private Tag tag1;

    @ManyToOne
    @JoinColumn(name = "tag_2_id")
    private Tag tag2;

    @ManyToOne
    @JoinColumn(name = "tag_3_id")
    private Tag tag3;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public Long getCocktail_id() {
        return cocktail_id;
    }

    public void setCocktail_id(Long cocktail_id) {
        this.cocktail_id = cocktail_id;
    }

    public String getCocktail_name() {
        return cocktail_name;
    }

    public void setCocktail_name(String cocktail_name) {
        this.cocktail_name = cocktail_name;
    }

    public String getCocktail_image() {
        return cocktail_image;
    }

    public void setCocktail_image(String cocktail_image) {
        this.cocktail_image = cocktail_image;
    }

    public String getCocktail_description() {
        return cocktail_description;
    }

    public void setCocktail_description(String cocktail_description) {
        this.cocktail_description = cocktail_description;
    }

    public String getCocktail_instruction() {
        return cocktail_instruction;
    }

    public void setCocktail_instruction(String cocktail_instruction) {
        this.cocktail_instruction = cocktail_instruction;
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
                "cocktail_id=" + cocktail_id +
                ", cocktail_name='" + cocktail_name + '\'' +
                ", cocktail_image='" + cocktail_image + '\'' +
                ", cocktail_description='" + cocktail_description + '\'' +
                ", cocktail_instruction='" + cocktail_instruction + '\'' +
                ", tag1=" + tag1 +
                ", tag2=" + tag2 +
                ", tag3=" + tag3 +
                ", country=" + country +
                '}';
    }

    public Cocktail() {
    }

    public Cocktail(Long cocktail_id, String cocktail_name, String cocktail_image, String cocktail_description, String cocktail_instruction, Country country) {
        this.cocktail_id = cocktail_id;
        this.cocktail_name = cocktail_name;
        this.cocktail_image = cocktail_image;
        this.cocktail_description = cocktail_description;
        this.cocktail_instruction = cocktail_instruction;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cocktail cocktail = (Cocktail) o;
        return Objects.equals(cocktail_id, cocktail.cocktail_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cocktail_id);
    }
}
