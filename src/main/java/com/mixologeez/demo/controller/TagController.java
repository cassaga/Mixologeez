package com.mixologeez.demo.controller;


import com.mixologeez.demo.models.Tag;
import com.mixologeez.demo.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/v1/tag")
public class TagController {

    private final TagRepository tagRepository;

    @Autowired
    public TagController(TagRepository tagRepository) {
        this.tagRepository =tagRepository;
    }

    @GetMapping
    public List<Tag> getAllTag() {
        return (List<Tag>) tagRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tag> getTagById(@PathVariable Integer id) {
        return tagRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tag addYTag(@RequestBody Tag tag) {
        return tagRepository.save(tag);
    }
}
