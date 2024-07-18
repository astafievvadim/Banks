package com.practice.banks.dto;

import com.practice.banks.model.Entry;
import jakarta.persistence.OneToOne;

import java.util.Date;

public class RestrictionDto {

    private String rstr;
    private Date rstrDate;
    private Entry entry;

}
