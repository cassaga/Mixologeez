package com.mixologeez.demo.services;

import org.springframework.stereotype.Service;

import com.mixologeez.demo.models.Country;
import com.mixologeez.demo.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getAllCountry() {
        return (List<Country>) countryRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Country> getCountryById(int id) {
        return countryRepository.findById(id);
    }


    @Transactional
    public Country save(Country country){
        return countryRepository.save(country);

    }


    public void deleteCountry(int id) {
        countryRepository.deleteById(id);
    }


}


