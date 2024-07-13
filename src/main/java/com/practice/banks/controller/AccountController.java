package com.practice.banks.controller;

import com.practice.banks.model.Account;
import com.practice.banks.repository.ParticipantRepository;
import com.practice.banks.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController
//@RequestMapping("/api/v1/accounts")
@AllArgsConstructor
public class AccountController {

    @Autowired
    private final AccountService service;

    @Autowired
    private final ParticipantRepository bank;

    @GetMapping("/find_all_Accounts")
    public List<Account> findAll() {
        return service.findAll();
    }

    @PostMapping("/save_Account")
    public String saveAccount(@RequestBody Account Account) {
        service.saveAccount(Account);
        return "Account successfully saved";
    }

    @GetMapping("/{id}")
    public Optional<Account> findByID(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/participants/{EntryId}/accounts/{bankId}")
    public List<Account> findAccountByEntryID(@PathVariable Long EntryId) {
        return service.findByEntryId(EntryId);
    }

    @PutMapping("/update_Account")
    public Account updateAccount(@RequestBody Account Account) {
        return service.updateAccount(Account);
    }

    @DeleteMapping("/delete_Account/{uid}")
    public void deleteAccount(@PathVariable Long id) {
        service.deleteAccount(id);
    }
    
}
