package com.practice.banks.service;

import java.util.List;
import java.util.Optional;

public interface SwbicService {
    List<SwbicService> findAll();
    SwbicService saveSWBIC(SwbicService SWBIC);
    List<SwbicService> findByDictionaryId(Long id);
    Optional<SwbicService> findById(Long id);
    SwbicService updateSWBIC(SwbicService SWBIC);
    void deleteSWBIC(Long id);
}
