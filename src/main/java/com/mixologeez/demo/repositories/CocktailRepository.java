package com.mixologeez.demo.repositories;

import com.mixologeez.demo.models.Cocktail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocktailRepository  extends CrudRepository<Cocktail, Integer> {
}
