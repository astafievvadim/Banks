package com.practice.banks.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* @TODO:
    1. Split this class into a dto with @data and a class @entity;
    2. Find a way to parse huge XML into Java fast
    3.

 */

@Entity
@Table(name = "bank")
@NoArgsConstructor
@AllArgsConstructor
public class Bank {

    //If I need something to be not empty, I should add @NonNull before it. Good luck to me

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bank_id")
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


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    @JoinColumn(name="directoryId", nullable=false)
    private Directory directory;

    //@OneToMany(mappedBy="bankId")
    @OneToMany(mappedBy = "bank")
    private Set<Account> accounts  = new HashSet<>();

    public void addBank(Account acc){
        accounts.add(acc);
        acc.setBank(this);
    }

    public void removeBank(Account acc){
        accounts.remove(acc);
        acc.setBank(null);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameP() {
        return NameP;
    }

    public void setNameP(String nameP) {
        NameP = nameP;
    }

    public String getRgn() {
        return Rgn;
    }

    public void setRgn(String rgn) {
        Rgn = rgn;
    }

    public String getInd() {
        return Ind;
    }

    public void setInd(String ind) {
        Ind = ind;
    }

    public String getTnp() {
        return Tnp;
    }

    public void setTnp(String tnp) {
        Tnp = tnp;
    }

    public String getNnp() {
        return Nnp;
    }

    public void setNnp(String nnp) {
        Nnp = nnp;
    }

    public String getAdr() {
        return Adr;
    }

    public void setAdr(String adr) {
        Adr = adr;
    }

    public String getPrntBIC() {
        return PrntBIC;
    }

    public void setPrntBIC(String prntBIC) {
        PrntBIC = prntBIC;
    }

    public Date getDateIn() {
        return DateIn;
    }

    public void setDateIn(Date dateIn) {
        DateIn = dateIn;
    }

    public String getPtType() {
        return PtType;
    }

    public void setPtType(String ptType) {
        PtType = ptType;
    }

    public String getSrvcs() {
        return Srvcs;
    }

    public void setSrvcs(String srvcs) {
        Srvcs = srvcs;
    }

    public String getXchType() {
        return XchType;
    }

    public void setXchType(String xchType) {
        XchType = xchType;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getParticipantStatus() {
        return ParticipantStatus;
    }

    public void setParticipantStatus(String participantStatus) {
        ParticipantStatus = participantStatus;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
}
