package com.practice.banks.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.practice.banks.model.Account;
import com.practice.banks.model.Dictionary;
import com.practice.banks.model.Participant;
import com.practice.banks.model.Restriction;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.HashSet;
import java.util.Set;

@Data
public class EntryDto {

    private String BIC;
    private String ChangeType;
    private Dictionary dictionary;
    private Participant participant;
    private Restriction restriction;
    private Set<Account> accounts = new HashSet<>();

}
