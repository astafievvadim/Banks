package com.practice.banks.service;

import com.practice.banks.model.Participant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ParticipantService {
    List<Participant> findAllBank();
    Participant saveBank(Participant participant);
    List<Participant> findByEntryId(Long id);
    Optional<Participant> findById(Long id);
    Participant updateBank(Participant participant);
    void deleteBank(Long id);
}
