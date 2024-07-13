package com.practice.banks.repository;

import com.practice.banks.model.Account;
import com.practice.banks.model.Dictionary;
import com.practice.banks.model.Entry;
import com.practice.banks.model.Participant;
import jakarta.servlet.http.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface ParticipantRepository extends JpaRepository<Participant,Long> {

    @Transactional
    void deleteById(Long id);
    Optional<Participant> findById(Long id);
    List<Participant> findByEntryId(Long id);
}
