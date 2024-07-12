package com.practice.banks.repository;

import com.practice.banks.model.Directory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface DirectoryRepository extends JpaRepository<Directory, Long> {
    @Transactional
    void deleteById(Long id);
    Optional<Directory> findById(Long id);
}
