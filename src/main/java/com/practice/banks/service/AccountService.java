package com.practice.banks.service;

import com.practice.banks.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AccountService {

    List<Account> findAll();
    Account saveAccount(Account account);
    List<Account> findByEntryId(Long id);
    Optional<Account> findById(Long id);
    Account updateAccount(Account account);
    void deleteAccount(Long id);
    
}
