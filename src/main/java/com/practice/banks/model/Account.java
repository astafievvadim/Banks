package com.practice.banks.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
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
    private String CK;
    private String AccountCBRBIC;
    private Date DateIn;
    private Date DateOut;
    private String AccountStatus;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    @JoinColumn(name="entryId", nullable=false)
    private Entry entry;

    @OneToMany(mappedBy = "account")
    private AccRestriction accRestriction;

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

    public String getCK() {
        return CK;
    }

    public void setCK(String CK) {
        this.CK = CK;
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

    public Date getDateOut() {
        return DateOut;
    }

    public void setDateOut(Date dateOut) {
        DateOut = dateOut;
    }

    public String getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        AccountStatus = accountStatus;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    public AccRestriction getAccRestriction() {
        return accRestriction;
    }

    public void setAccRestriction(AccRestriction accRestriction) {
        this.accRestriction = accRestriction;
    }
}
