package com.practice.banks.controller;

import com.practice.banks.model.Participant;
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

    @GetMapping("/find_all_participants")
    public List<Participant> findAllParticipant() {
        return service.findAll();
    }

    @PostMapping("/save_participant")
    public String saveParticipant(@RequestBody Participant participant) {
        service.saveParticipant(participant);
        return "Participant successfully saved";
    }

    @GetMapping("/{id}")
    public Optional<Participant> findByID(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/update_participant")
    public Participant updateParticipant(@RequestBody Participant participant) {
        return service.updateParticipant(participant);
    }

    @DeleteMapping("/delete_participant/{id}")
    public void deleteParticipant(@PathVariable Long id) {
        service.deleteParticipant(id);
    }
    
        /*
    @GetMapping("/bics/{BICDirectoryId}/participants/{participantId}")
    public List<Participant> findParticipantByBICDirectoryID(@PathVariable Long BICDirectoryId) {
        return service.findByBICDirectoryId(BICDirectoryId);
    }
    */
}
