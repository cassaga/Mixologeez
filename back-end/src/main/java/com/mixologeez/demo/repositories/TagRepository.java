package com.mixologeez.demo.repositories;


import com.mixologeez.demo.models.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository  extends CrudRepository<Tag, Integer> {
}
