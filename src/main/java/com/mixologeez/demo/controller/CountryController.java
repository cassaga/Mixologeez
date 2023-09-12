package com.mixologeez.demo.controller;

import com.mixologeez.demo.models.Country;
import com.mixologeez.demo.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CountryController {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping("/country/v1")
    public List<Country> getAllCountries() {
        return (List<Country>) countryRepository.findAll();
    }

    @GetMapping("/country/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable Long id) {
        Optional<Country> country = countryRepository.findById(Math.toIntExact(id));
        if (country.isPresent()) {
            return ResponseEntity.ok(country.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/country")
    public Country addCountry(@RequestBody Country country) {
        return countryRepository.save(country);
    }
}
