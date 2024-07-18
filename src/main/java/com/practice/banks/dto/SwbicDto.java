package com.practice.banks.dto;

import com.practice.banks.model.Participant;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class SwbicDto {

    private String SWBIC;
    private String DefaultSWBIC;
    private Participant participant;

}
