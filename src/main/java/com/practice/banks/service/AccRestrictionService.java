package com.practice.banks.service;

import com.practice.banks.model.AccRestriction;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface AccRestrictionService {

    List<AccRestriction> findAllAccRestriction();
    AccRestriction saveAccRestriction(AccRestriction AccRestriction);
    List<AccRestriction> findByAccountId(Long id);
    Optional<AccRestriction> findById(Long id);
    AccRestriction updateAccRestriction(AccRestriction AccRestriction);
    void deleteAccRestriction(Long id);
    
}
