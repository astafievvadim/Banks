package com.practice.banks.controller;

import com.practice.banks.model.Participant;
import com.practice.banks.repository.DirectoryRepository;
import com.practice.banks.service.ParticipantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/participants")
@AllArgsConstructor
public class ParticipantController {

    @Autowired
    private final ParticipantService service;
    @Autowired
    private final DirectoryRepository bicDirectoryRepo;


    @GetMapping("/find_all_banks")
    public List<Participant> findAllBank() {
        return service.findAllBank();
    }

    @PostMapping("/save_bank")
    public String saveBank(@RequestBody Participant participant) {
        service.saveBank(participant);
        return "Participant successfully saved";
    }

    @GetMapping("/{id}")
    public Optional<Participant> findByID(@PathVariable Long id) {
        return service.findById(id);
    }
/*
    @GetMapping("/bics/{BICDirectoryId}/participants/{bankId}")
    public List<Participant> findBankByBICDirectoryID(@PathVariable Long BICDirectoryId) {
        return service.findByBICDirectoryId(BICDirectoryId);
    }


 */
    @PutMapping("/update_bank")
    public Participant updateBank(@RequestBody Participant participant) {
        return service.updateBank(participant);
    }

    @DeleteMapping("/delete_bank/{uid}")
    public void deleteBank(@PathVariable Long id) {
        service.deleteBank(id);
    }
}
