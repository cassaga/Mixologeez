package com.mixologeez.demo.controller;


import com.mixologeez.demo.models.Tag;
import com.mixologeez.demo.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/v1/tag")
public class TagController {

    private final TagService tagService;

    @Autowired
    public TagController(TagService tagService)  { this.tagService =tagService;}


    @GetMapping
    public List<Tag> getAllTag() {
        return (List<Tag>) tagService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tag> getTagById(@PathVariable Integer id) {
        return tagService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tag addYTag(@RequestBody Tag tag) {
        return tagService.save(tag);
    }
}
