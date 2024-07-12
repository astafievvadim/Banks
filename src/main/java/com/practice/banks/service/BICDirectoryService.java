package com.practice.banks.service;

import com.practice.banks.model.BICDirectory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BICDirectoryService {
    List<BICDirectory> findAllBICDirectory();
    BICDirectory saveBICDirectory(BICDirectory BICDirectory);
    Optional<BICDirectory> findById(Long id);
    BICDirectory updateBICDirectory(BICDirectory BICDirectory);
    void deleteBICDirectory(Long id);
}
