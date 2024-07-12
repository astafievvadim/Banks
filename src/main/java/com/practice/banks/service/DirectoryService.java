package com.practice.banks.service;

import com.practice.banks.model.Directory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DirectoryService {
    List<Directory> findAllBICDirectory();
    Directory saveBICDirectory(Directory Directory);
    Optional<Directory> findById(Long id);
    Directory updateBICDirectory(Directory Directory);
    void deleteBICDirectory(Long id);
}
