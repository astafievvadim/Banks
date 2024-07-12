package com.practice.banks.service;

import com.practice.banks.model.Bank;
import com.practice.banks.repository.BankRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class BankServiceImpl implements BankService{
    @Autowired
    private final BankRepository repository;


    @Override
    public List<Bank> findAllBank() {
        return repository.findAll();
    }

    @Override
    public Bank saveBank(Bank bank) {
        return repository.save(bank);
    }

    @Override
    public List<Bank> findByDirectoryId(Long id) {
        return repository.findByDirectoryId(id);
    }

    @Override
    public Optional<Bank> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Bank updateBank(Bank bank) {
        return repository.save(bank);
    }

    @Override
    @Transactional
    public void deleteBank(Long id) {
            repository.deleteById(id);
    }
}
