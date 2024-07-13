package com.practice.banks.repository;

import com.practice.banks.model.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface DictionaryRepository extends JpaRepository<Dictionary,Long> {
    @Transactional
    void deleteById(Long id);
    Optional<Dictionary> findById(Long id);

}
