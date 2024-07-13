package com.practice.banks.service;

import com.practice.banks.model.Entry;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface EntryService {
    List<Entry> findAllEntry();
    Entry saveEntry(Entry Entry);
    List<Entry> findByDictionaryId(Long id);
    Optional<Entry> findById(Long id);
    Entry updateEntry(Entry Entry);
    void deleteEntry(Long id);
}
