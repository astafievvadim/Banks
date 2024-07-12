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
    public List<Directory> findAllDirectory() {
        return repository.findAll();
    }

    @Override
    public Directory saveDirectory(Directory Directory) {
        return repository.save(Directory);
    }

    @Override
    public Optional<Directory> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Directory updateDirectory(Directory Directory) {
        return repository.save(Directory);
    }
    @Transactional
    @Override
    public void deleteDirectory(Long id) {
        repository.deleteById(id);
    }
}
