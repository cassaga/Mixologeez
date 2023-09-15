package com.mixologeez.demo.controller;

import com.mixologeez.demo.DTO.CocktailDTO;
import com.mixologeez.demo.models.Cocktail;
import com.mixologeez.demo.services.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/cocktail")
public class CocktailController {

    private final CocktailService cocktailService;

    @Autowired
    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @GetMapping
    public List<CocktailDTO> getAllCocktail() {
        return cocktailService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CocktailDTO> getCocktailById(@PathVariable Integer id) {
        CocktailDTO cocktailDTO = cocktailService.findById(id);
        if (null == cocktailDTO) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(cocktailDTO);
        }
    }

    @PostMapping
    public ResponseEntity<?> addCocktail(@RequestBody Cocktail cocktail) {
        CocktailDTO cocktailDTO = cocktailService.save(cocktail);
        if (null == cocktailDTO) {
            return ResponseEntity.badRequest().build();
        } else {
            return ResponseEntity.ok(cocktailDTO);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCocktailById(@PathVariable Integer id) {
        boolean deleted = cocktailService.deleteById(id);

        if (deleted) {
            return ResponseEntity.ok("Cocktail deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
