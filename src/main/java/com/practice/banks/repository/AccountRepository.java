package com.practice.banks.repository;

import com.practice.banks.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    @Transactional
    void deleteById(Long id);
    Optional<Account> findById(Long id);
    List<Account> findByBankId(Long id);
}
