package com.practice.banks.DTO;

import com.practice.banks.model.Bank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDTO {
    private Long id;

    private String Account;
    private String RegulationAccountType;
    private String CK_;
    private String AccountCBRBIC;
    private Date DateIn;
    private String AccountStatus;

    private Bank bank;
}
