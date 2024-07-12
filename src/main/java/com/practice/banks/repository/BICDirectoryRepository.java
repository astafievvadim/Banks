package com.practice.banks.repository;

import com.practice.banks.model.BICDirectory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface BICDirectoryRepository extends JpaRepository<BICDirectory, Long> {
    @Transactional
    void deleteById(Long id);
    Optional<BICDirectory> findById(Long id);
}
