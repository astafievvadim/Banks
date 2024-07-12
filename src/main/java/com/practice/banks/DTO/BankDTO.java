package com.practice.banks.DTO;

import com.practice.banks.model.Account;
import com.practice.banks.model.BICDirectory;
import com.practice.banks.model.Bank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankDTO {
    private Long id;
    private String NameP;
    private String Rgn;
    private String Ind;
    private String Tnp;
    private String Nnp;
    private String Adr;
    private String PrntBIC;
    private Date DateIn;
    private String PtType;
    private String Srvcs;
    private String XchType;
    private String UID;
    private String ParticipantStatus;

    private BICDirectory bicDirectory;
    private Set<Account> accounts;
}
