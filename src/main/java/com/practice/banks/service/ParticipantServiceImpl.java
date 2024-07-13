package com.practice.banks.service;

import com.practice.banks.model.Participant;
import com.practice.banks.repository.ParticipantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class ParticipantServiceImpl implements ParticipantService {
    @Autowired
    private final ParticipantRepository repository;


    @Override
    public List<Participant> findAllBank() {
        return repository.findAll();
    }

    @Override
    public Participant saveBank(Participant participant) {
        return repository.save(participant);
    }

    @Override
    public List<Participant> findByEntryId(Long id) {
        return repository.findByEntryId(id);
    }

    @Override
    public Optional<Participant> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Participant updateBank(Participant participant) {
        return repository.save(participant);
    }

    @Override
    @Transactional
    public void deleteBank(Long id) {
            repository.deleteById(id);
    }
}
