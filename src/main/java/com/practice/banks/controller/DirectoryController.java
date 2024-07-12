package com.practice.banks.controller;


import com.practice.banks.model.Directory;
import com.practice.banks.service.DirectoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/directories")
@AllArgsConstructor
public class DirectoryController {

    @Autowired
    private final DirectoryService service;

    @GetMapping("/find_all_directories")
    public List<Directory> findAllDirectory() {
        return service.findAllDirectory();
    }

    @PostMapping("/save_Directory")
    public String saveDirectory(@RequestBody Directory Directory) {
        service.saveDirectory(Directory);
        return "Directory successfully saved";
    }

    @GetMapping("/{id}")
    public Optional<Directory> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/update_Directory")
    public Directory updateDirectory(@RequestBody Directory Directory) {
        return service.updateDirectory(Directory);
    }

    @DeleteMapping("/delete_Directory/{uid}")
    public void deleteDirectory(@PathVariable Long id) {
        service.deleteDirectory(id);
    }
}
