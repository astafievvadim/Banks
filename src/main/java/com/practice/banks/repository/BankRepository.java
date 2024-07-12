package com.practice.banks.repository;

import com.practice.banks.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
    @Transactional
    void deleteById(Long id);
    List<Bank> findByBICDirectoryId(Long id);
    Optional<Bank> findById(Long id);

}
