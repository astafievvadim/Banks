package com.practice.banks.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="account_id")
    private Long id;

    private String Account;
    private String RegulationAccountType;
    private String CK_;
    private String AccountCBRBIC;
    private Date DateIn;
    private String AccountStatus;

    //@ManyToOne(fetch = FetchType.LAZY, optional = false)
    //@OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore
    //@JoinColumn(name="id", nullable=false)
    @ManyToOne
    private Bank bank;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public String getRegulationAccountType() {
        return RegulationAccountType;
    }

    public void setRegulationAccountType(String regulationAccountType) {
        RegulationAccountType = regulationAccountType;
    }

    public String getCK_() {
        return CK_;
    }

    public void setCK_(String CK_) {
        this.CK_ = CK_;
    }

    public String getAccountCBRBIC() {
        return AccountCBRBIC;
    }

    public void setAccountCBRBIC(String accountCBRBIC) {
        AccountCBRBIC = accountCBRBIC;
    }

    public Date getDateIn() {
        return DateIn;
    }

    public void setDateIn(Date dateIn) {
        DateIn = dateIn;
    }

    public String getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        AccountStatus = accountStatus;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
