package com.practice.banks.controller;

import com.practice.banks.model.Bank;
import com.practice.banks.repository.BICDirectoryRepository;
import com.practice.banks.service.BankService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/banks")
@AllArgsConstructor
public class BankController {

    @Autowired
    private final BankService service;
    @Autowired
    private final BICDirectoryRepository bicDirectoryRepo;


    @GetMapping("/find_all_banks")
    public List<Bank> findAllBank() {
        return service.findAllBank();
    }

    @PostMapping("/save_bank")
    public String saveBank(@RequestBody Bank bank) {
        service.saveBank(bank);
        return "Bank successfully saved";
    }

    @GetMapping("/{id}")
    public Optional<Bank> findByID(@PathVariable Long id) {
        return service.findById(id);
    }
/*
    @GetMapping("/bics/{BICDirectoryId}/banks/{bankId}")
    public List<Bank> findBankByBICDirectoryID(@PathVariable Long BICDirectoryId) {
        return service.findByBICDirectoryId(BICDirectoryId);
    }


 */
    @PutMapping("/update_bank")
    public Bank updateBank(@RequestBody Bank bank) {
        return service.updateBank(bank);
    }

    @DeleteMapping("/delete_bank/{uid}")
    public void deleteBank(@PathVariable Long id) {
        service.deleteBank(id);
    }
}
