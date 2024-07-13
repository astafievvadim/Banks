package com.practice.banks.service;

import com.practice.banks.model.Dictionary;
import com.practice.banks.model.Dictionary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DictionaryService {
    List<Dictionary> findAll();
    Dictionary saveDictionary(Dictionary Dictionary);
    Optional<Dictionary> findById(Long id);
    Dictionary updateDictionary(Dictionary Dictionary);
    void deleteDictionary(Long id);
}
