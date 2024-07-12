package com.practice.banks.service;

import com.practice.banks.model.Bank;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BankService {
    List<Bank> findAllBank();
    Bank saveBank(Bank bank);
    //List<Bank> findByBICDirectoryId(Long id);
    Optional<Bank> findById(Long id);
    Bank updateBank(Bank bank);
    void deleteBank(Long id);
}
