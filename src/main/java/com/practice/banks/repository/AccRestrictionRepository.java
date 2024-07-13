package com.practice.banks.repository;

import com.practice.banks.model.AccRestriction;
import com.practice.banks.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccRestrictionRepository extends JpaRepository<AccRestriction,Long> {
    @Transactional
    void deleteById(Long id);
    void updateById(Long id);
    Optional<AccRestriction> findById(Long id);
    List<AccRestriction> findByAccountId(Long id);

}
