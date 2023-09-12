package com.mixologeez.demo.services;

import com.mixologeez.demo.models.Cocktail;
import com.mixologeez.demo.repositories.CocktailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CocktailService {

    private final CocktailRepository cocktailRepository;

    @Autowired
    public CocktailService(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }

    public List<Cocktail> findAll() {
        return (List<Cocktail>) cocktailRepository.findAll();
    }

    public Optional<Cocktail> findById(Integer id) {
        return cocktailRepository.findById(id);
    }

    public Cocktail save(Cocktail cocktail) {
        return cocktailRepository.save(cocktail);
    }

    public void deleteById(Integer id) {
        cocktailRepository.deleteById(id);
    }
}
