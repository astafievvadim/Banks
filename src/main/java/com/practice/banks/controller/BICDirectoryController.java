package com.practice.banks.controller;


import com.practice.banks.model.BICDirectory;
import com.practice.banks.service.BICDirectoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/bics")
@AllArgsConstructor
public class BICDirectoryController {

    @Autowired
    private final BICDirectoryService service;

    @GetMapping("/find_all_bics")
    public List<BICDirectory> findAllBIC() {
        return service.findAllBICDirectory();
    }

    @PostMapping("/save_BIC")
    public String saveBIC(@RequestBody BICDirectory BIC) {
        service.saveBICDirectory(BIC);
        return "BIC successfully saved";
    }

    @GetMapping("/{id}")
    public Optional<BICDirectory> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/update_BIC")
    public BICDirectory updateBIC(@RequestBody BICDirectory BIC) {
        return service.updateBICDirectory(BIC);
    }

    @DeleteMapping("/delete_BIC/{uid}")
    public void deleteBIC(@PathVariable Long id) {
        service.deleteBICDirectory(id);
    }
}
