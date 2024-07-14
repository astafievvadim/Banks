package com.practice.banks.dto;

import lombok.Data;

import java.util.Date;
@Data
public class AccountDto {

    private Long id;
    private String Account;
    private String RegulationAccountType;
    private String CK;
    private String AccountCBRBIC;
    private Date DateIn;
    private Date DateOut;
    private String AccountStatus;

}
