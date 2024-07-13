package com.practice.banks.repository;

import com.practice.banks.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    @Transactional
    void deleteById(Long id);
    List<Participant> findByEntryId(Long id);
    Optional<Participant> findById(Long id);

}
