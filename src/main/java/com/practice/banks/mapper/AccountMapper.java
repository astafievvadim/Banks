package com.practice.banks.mapper;

import com.practice.banks.dto.AccountDto;
import com.practice.banks.model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    
    public AccountDto fromEntityToDto(Account acc) {

        AccountDto dto = new AccountDto();

        dto.setId(acc.getId());
        dto.setCK(acc.getCK());
        dto.setAccount(acc.getAccount());
        dto.setAccountCBRBIC(acc.getAccountCBRBIC());
        dto.setAccountStatus(acc.getAccountStatus());
        dto.setDateIn(acc.getDateIn());
        dto.setDateOut(acc.getDateOut());
        dto.setRegulationAccountType(acc.getRegulationAccountType());

        return dto;
    }
    
    public Account fromDtoToEntity(AccountDto dto) {

        Account acc = new Account();

        acc.setId(dto.getId());
        acc.setCK(dto.getCK());
        acc.setAccount(dto.getAccount());
        acc.setAccountCBRBIC(dto.getAccountCBRBIC());
        acc.setAccountStatus(dto.getAccountStatus());
        acc.setDateIn(dto.getDateIn());
        acc.setDateOut(dto.getDateOut());
        acc.setRegulationAccountType(dto.getRegulationAccountType());

        return acc;
    }
}
