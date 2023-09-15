package com.mixologeez.demo.repositories;


import com.mixologeez.demo.models.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository  extends CrudRepository<Country, Integer> {
}
