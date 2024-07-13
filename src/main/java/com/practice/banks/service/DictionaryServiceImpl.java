package com.practice.banks.service;

import com.practice.banks.model.Dictionary;
import com.practice.banks.model.Dictionary;
import com.practice.banks.repository.DictionaryRepository;
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
public class DictionaryServiceImpl implements DictionaryService {
@Autowired
    private final DictionaryRepository repository;
    @Override
    public List<Dictionary> findAll() {
        return repository.findAll();
    }

    @Override
    public Dictionary saveDictionary(Dictionary dictionary) {
        return repository.save(dictionary);
    }

    @Override
    public Optional<Dictionary> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Dictionary updateDictionary(Dictionary dictionary) {
        return repository.save(dictionary);
    }
    @Transactional
    @Override
    public void deleteDictionary(Long id) {
        repository.deleteById(id);
    }
}
