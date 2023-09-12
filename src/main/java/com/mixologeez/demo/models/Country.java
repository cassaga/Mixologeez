package com.mixologeez.demo.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long country_id;

    @Column(name = "country_name")
    public String country_name;

    @Column(name = "country_coordinates")
    public String country_coordinate;

    @OneToMany(mappedBy = "country")
    private List<Cocktail> cocktails;

    public Long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Long country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_coordinate() {
        return country_coordinate;
    }

    public void setCountry_coordinate(String country_coordinate) {
        this.country_coordinate = country_coordinate;
    }

    public List<Cocktail> getCocktails() {
        return cocktails;
    }

    public void setCocktails(List<Cocktail> cocktails) {
        this.cocktails = cocktails;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_id=" + country_id +
                ", country_name='" + country_name + '\'' +
                ", country_coordinate='" + country_coordinate + '\'' +
                ", cocktails=" + cocktails +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(country_id, country.country_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country_id);
    }

    public Country() {
    }

    public Country(Long country_id, String country_name, String country_coordinate, List<Cocktail> cocktails) {
        this.country_id = country_id;
        this.country_name = country_name;
        this.country_coordinate = country_coordinate;
        this.cocktails = cocktails;
    }

}
