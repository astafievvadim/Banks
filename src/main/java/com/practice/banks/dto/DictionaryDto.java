package com.practice.banks.dto;

import com.practice.banks.model.Entry;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class DictionaryDto {

    private String name; //just a name
    private String EDNo; //9-digit number
    private Date EDDate; //YYYY-MM-DD
    private String EDAuthor; //10-digit number;
    private String EDReceiver; //10-digit number
    private String CreationReason; //4-digit number
    private Date CreationDateTime; //DIFFERENT TYPE! YYYY-MM-DD hh:mm:ss
    private String InfoTypeCode; // 4-digit number;
    private String BusinessDay; // YYYY-MM-DD;
    private String DirectoryVersion; //small-digit number;
    private Set<Entry> entries = new HashSet<>();
}
