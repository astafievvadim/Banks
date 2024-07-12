package com.practice.banks.service;

import com.practice.banks.model.Directory;
import com.practice.banks.repository.DirectoryRepository;
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
public class DirectoryServiceImpl implements DirectoryService {
@Autowired
    private final DirectoryRepository repository;
    @Override
    public List<Directory> findAllBICDirectory() {
        return repository.findAll();
    }

    @Override
    public Directory saveBICDirectory(Directory Directory) {
        return repository.save(Directory);
    }

    @Override
    public Optional<Directory> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Directory updateBICDirectory(Directory Directory) {
        return repository.save(Directory);
    }
    @Transactional
    @Override
    public void deleteBICDirectory(Long id) {
        repository.deleteById(id);
    }
}
