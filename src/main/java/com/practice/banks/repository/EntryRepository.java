package com.practice.banks.repository;

import com.practice.banks.model.Entry;
import com.practice.banks.model.Dictionary;
import com.practice.banks.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface EntryRepository extends JpaRepository<Entry,Long> {
    @Transactional
    void deleteById(Long id);
    void updateById(Long id);
    Optional<Entry> findById(Long id);
    List<Entry> findByDictionaryId(Long id);


}
