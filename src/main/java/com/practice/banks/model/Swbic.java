package com.practice.banks.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "swbic")
@NoArgsConstructor
@AllArgsConstructor
public class Swbic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="swbic_id")
    private Long id;
    private String SWBIC;
    private String DefaultSWBIC;

    @OneToOne
    @JoinColumn(name="participantId")
    private Participant participant;
}
