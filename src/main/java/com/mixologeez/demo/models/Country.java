package com.mixologeez.demo.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name= "COUNTRY")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private int countryId;

    @Column(name = "country_name")
    public String countryName;

    @Column(name = "country_coordinates")
    public String countryCoordinate;

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCoordinate() {
        return countryCoordinate;
    }

    public void setCountryCoordinate(String countryCoordinate) {
        this.countryCoordinate = countryCoordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryId, country.countryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId);
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", countryCoordinate='" + countryCoordinate + '\'' +
                '}';
    }

    public Country() {
    }

}
