package com.practice.banks.controller;


import com.practice.banks.model.Dictionary;
import com.practice.banks.model.Dictionary;
import com.practice.banks.service.DictionaryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/dictionaries")
@AllArgsConstructor
public class DictionaryController {

    @Autowired
    private final DictionaryService service;

    @GetMapping("/find_all_dictionaries")
    public List<Dictionary> findAllDictionary() {
        return service.findAllDictionary();
    }

    @PostMapping("/save_Dictionary")
    public String saveDictionary(@RequestBody Dictionary Dictionary) {
        service.saveDictionary(Dictionary);
        return "Directory successfully saved";
    }

    @GetMapping("/{id}")
    public Optional<Dictionary> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/update_Dictionary")
    public Dictionary updateDictionary(@RequestBody Dictionary Dictionary) {
        return service.updateDictionary(Dictionary);
    }

    @DeleteMapping("/delete_Dictionary/{uid}")
    public void deleteDictionary(@PathVariable Long id) {
        service.deleteDictionary(id);
    }
}
