package com.mixologeez.demo.services;

import com.mixologeez.demo.DTO.CocktailDTO;
import com.mixologeez.demo.models.Cocktail;
import com.mixologeez.demo.repositories.CocktailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class CocktailService {

    private final CocktailRepository cocktailRepository;

    @Autowired
    public CocktailService(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }

    @Transactional(readOnly = true)
    public List<CocktailDTO> findAll() {
      List<Cocktail> cocktails = (List<Cocktail>) cocktailRepository.findAll();
      List <CocktailDTO> cocktailDTOs  = new ArrayList<>();

      for (Cocktail cocktail : cocktails){
          CocktailDTO cocktailDTO = new CocktailDTO(cocktail);
          cocktailDTOs.add(cocktailDTO);
      }
      return  cocktailDTOs;
    }

    @Transactional(readOnly = true)
    public CocktailDTO findById(Integer id) {
        Cocktail cocktail = cocktailRepository.findByCocktailId(id);
        if(null== cocktail){
            return null;
        } else {
            return new CocktailDTO(cocktail);
        }
    }

    public Cocktail save(Cocktail cocktail) {
        return cocktailRepository.save(cocktail);
    }

    public boolean deleteById(Integer id) {
        Optional<Cocktail> existingCocktail = cocktailRepository.findById(id);

        if (existingCocktail.isPresent()) {
            cocktailRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
