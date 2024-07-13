package com.practice.banks.service;

import com.practice.banks.model.Account;
import com.practice.banks.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class AccountServiceImpl implements AccountService{
@Autowired
    private final AccountRepository repository;
    @Override
    public List<Account> findAllAccount() {
        return repository.findAll();
    }

    @Override
    public Account saveAccount(Account account) {
        return repository.save(account);
    }

    @Override
    public List<Account> findByDictionaryId(Long id) {
        return null;
    }

    @Override
    public List<Account> findByEntryId(Long id) {
        return repository.findByEntryId(id);
    }



    @Override
    public Optional<Account> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Account updateAccount(Account account) {
        return repository.save(account);
    }

    @Override
    public void deleteAccount(Long id) {
        repository.deleteById(id);
    }
}
