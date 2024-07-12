package com.practice.banks.controller;


import com.practice.banks.model.Directory;
import com.practice.banks.service.DirectoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/bics")
@AllArgsConstructor
public class DirectoryController {

    @Autowired
    private final DirectoryService service;

    @GetMapping("/find_all_bics")
    public List<Directory> findAllBIC() {
        return service.findAllBICDirectory();
    }

    @PostMapping("/save_BIC")
    public String saveBIC(@RequestBody Directory BIC) {
        service.saveBICDirectory(BIC);
        return "BIC successfully saved";
    }

    @GetMapping("/{id}")
    public Optional<Directory> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/update_BIC")
    public Directory updateBIC(@RequestBody Directory BIC) {
        return service.updateBICDirectory(BIC);
    }

    @DeleteMapping("/delete_BIC/{uid}")
    public void deleteBIC(@PathVariable Long id) {
        service.deleteBICDirectory(id);
    }
}
