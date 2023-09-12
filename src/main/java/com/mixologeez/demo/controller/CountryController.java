package com.mixologeez.demo.controller;

import com.mixologeez.demo.models.Country;
import com.mixologeez.demo.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/country")
public class CountryController {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return (List<Country>) countryRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable Integer id) {
        return countryRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryRepository.save(country);
    }
}
