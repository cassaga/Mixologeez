package com.mixologeez.demo.services;

import com.mixologeez.demo.DTO.CocktailDTO;
import com.mixologeez.demo.DTO.CocktailPostDTO;
import com.mixologeez.demo.models.Cocktail;
import com.mixologeez.demo.models.Country;
import com.mixologeez.demo.models.Tag;
import com.mixologeez.demo.repositories.CocktailRepository;

import com.mixologeez.demo.repositories.CountryRepository;
import com.mixologeez.demo.repositories.TagRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class CocktailService {

    private final CocktailRepository cocktailRepository;
    private final TagRepository tagRepository;
    private final CountryRepository countryRepository;

    @Autowired
    public CocktailService(CocktailRepository cocktailRepository, TagRepository tagRepository, CountryRepository countryRepository) {
        this.cocktailRepository = cocktailRepository;
        this.tagRepository = tagRepository;
        this.countryRepository = countryRepository;
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

    public void save(CocktailPostDTO cocktailPostDTO) {
        Cocktail cocktail = new Cocktail();
        cocktail.setCocktailName(cocktailPostDTO.getCocktailName());
        cocktail.setCocktailImage(cocktailPostDTO.getCocktailImage());
        cocktail.setCocktailDescription(cocktailPostDTO.getCocktailDescription());
        cocktail.setCocktailInstruction(cocktailPostDTO.getCocktailInstruction());

        if (cocktailPostDTO.getTag1Id() != null) {
            Tag tag = tagRepository.findById(cocktailPostDTO.getTag1Id())
                    .orElseThrow(() -> new EntityNotFoundException("Tag non trouvé"));
            cocktail.setTag1(tag);
        }

        if (cocktailPostDTO.getTag2Id() != null) {
            Tag tag = tagRepository.findById(cocktailPostDTO.getTag2Id())
                    .orElseThrow(() -> new EntityNotFoundException("Tag non trouvé"));
            cocktail.setTag2(tag);
        }

        if (cocktailPostDTO.getTag3Id() != null) {
            Tag tag = tagRepository.findById(cocktailPostDTO.getTag3Id())
                    .orElseThrow(() -> new EntityNotFoundException("Tag non trouvé"));
            cocktail.setTag3(tag);
        }

        if (cocktailPostDTO.getCountryId() != null) {
            Country country = countryRepository.findById(cocktailPostDTO.getCountryId())
                    .orElseThrow(() -> new EntityNotFoundException("Pays non trouvé"));
            cocktail.setCountry(country);
        }
        cocktailRepository.save(cocktail);
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

    public void updateById(Integer id, CocktailPostDTO cocktailPostDTO) {
        Cocktail cocktail = cocktailRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cocktail non trouvé"));

        if (cocktailPostDTO.getCocktailName() != null) {
            cocktail.setCocktailName(cocktailPostDTO.getCocktailName());
        }

        if (cocktailPostDTO.getCocktailImage() != null) {
            cocktail.setCocktailImage(cocktailPostDTO.getCocktailImage());
        }

        if (cocktailPostDTO.getCocktailDescription() != null) {
            cocktail.setCocktailDescription(cocktailPostDTO.getCocktailDescription());
        }

        if (cocktailPostDTO.getCocktailInstruction() != null) {
            cocktail.setCocktailInstruction(cocktailPostDTO.getCocktailInstruction());
        }

        if (cocktailPostDTO.getTag1Id() != null) {
            Tag tag = tagRepository.findById(cocktailPostDTO.getTag1Id())
                    .orElseThrow(() -> new EntityNotFoundException("Tag non trouvé"));
            cocktail.setTag1(tag);
        }

        if (cocktailPostDTO.getTag2Id() != null) {
            Tag tag = tagRepository.findById(cocktailPostDTO.getTag2Id())
                    .orElseThrow(() -> new EntityNotFoundException("Tag non trouvé"));
            cocktail.setTag2(tag);
        }

        if (cocktailPostDTO.getTag3Id() != null) {
            Tag tag = tagRepository.findById(cocktailPostDTO.getTag3Id())
                    .orElseThrow(() -> new EntityNotFoundException("Tag non trouvé"));
            cocktail.setTag3(tag);
        }

        if (cocktailPostDTO.getCountryId() != null) {
            Country country = countryRepository.findById(cocktailPostDTO.getCountryId())
                    .orElseThrow(() -> new EntityNotFoundException("Pays non trouvé"));
            cocktail.setCountry(country);
        }
        cocktailRepository.save(cocktail);
    }
}
