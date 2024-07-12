package com.practice.banks.service;

import com.practice.banks.model.BICDirectory;
import com.practice.banks.repository.BICDirectoryRepository;
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
public class BICDirectoryServiceImpl implements BICDirectoryService {
@Autowired
    private final BICDirectoryRepository repository;
    @Override
    public List<BICDirectory> findAllBICDirectory() {
        return repository.findAll();
    }

    @Override
    public BICDirectory saveBICDirectory(BICDirectory BICDirectory) {
        return repository.save(BICDirectory);
    }

    @Override
    public Optional<BICDirectory> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public BICDirectory updateBICDirectory(BICDirectory BICDirectory) {
        return repository.save(BICDirectory);
    }
    @Transactional
    @Override
    public void deleteBICDirectory(Long id) {
        repository.deleteById(id);
    }
}
