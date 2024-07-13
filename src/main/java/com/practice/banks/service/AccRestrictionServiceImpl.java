package com.practice.banks.service;

import com.practice.banks.model.AccRestriction;
import com.practice.banks.model.Account;
import com.practice.banks.repository.AccRestrictionRepository;
import com.practice.banks.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class AccRestrictionServiceImpl implements AccRestrictionService{

    @Autowired
    private AccRestrictionRepository rep;
    @Override
    public List<AccRestriction> findAll() {
        return rep.findAll();
    }

    @Override
    public AccRestriction saveAccRestriction(AccRestriction AccRestriction) {
        return rep.save(AccRestriction);
    }

    @Override
    public List<AccRestriction> findByAccountId(Long id) {
        return findByAccountId(id);
    }

    @Override
    public Optional<AccRestriction> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public AccRestriction updateAccRestriction(AccRestriction AccRestriction) {
        return null;
    }

    @Override
    public void deleteAccRestriction(Long id) {

    }
}
