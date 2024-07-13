package com.practice.banks.service;

import java.util.List;
import java.util.Optional;

public interface SWBICService {
    List<SWBICService> findAllSWBIC();
    SWBICService saveSWBIC(SWBICService SWBIC);
    List<SWBICService> findByDictionaryId(Long id);
    Optional<SWBICService> findById(Long id);
    SWBICService updateSWBIC(SWBICService SWBIC);
    void deleteSWBIC(Long id);
}
