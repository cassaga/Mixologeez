package com.mixologeez.demo.controller;

i
import com.mixologeez.demo.models.Tag;
import com.mixologeez.demo.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TagController {

    private final TagRepository tagRepository;

    @Autowired
    public TagController(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @GetMapping("/tag/v1")
    public List<Tag> getAllTag() {
        return (List<Tag>) tagRepository.findAll();
    }

    @GetMapping("/tag/{id}")
    public ResponseEntity<Tag> getTagById(@PathVariable Integer id) {
        Optional<Tag> tag = tagRepository.findById(Math.toIntExact(id));
        return tag.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/tag")
    public Tag addTag(@RequestBody Tag tag ){
        return tagRepository.save(tag);
    }
}
