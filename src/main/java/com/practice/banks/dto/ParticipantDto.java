package com.practice.banks.dto;

import com.practice.banks.model.Entry;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

public class ParticipantDto {

    private String NameP; //russian
    private String EnglName; //obv english
    private String RegN; //9-digit, but text;
    private String CntrCd; //2-digit countryCode;
    private String Rgn; //2-digit, territoryCode;
    private String Ind; //6-digit, Index;
    private String Tnp; //5-digit, city-type etc;
    private String Nnp; //City name;
    private String Adr; //address;
    private String PrntBIC; //9-digit
    private Date DateIn; //YYYY-MM-DD;
    private Date DateOut; //YYYY-MM-DD;
    private String PtType; //2-digit;
    private String Srvcs; //1-digit;
    private String XchType;
    private String UID;
    private String ParticipantStatus;
    private Entry entry;
}
