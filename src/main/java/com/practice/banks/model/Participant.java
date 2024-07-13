package com.practice.banks.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.practice.banks.jasonDeserializer.ParticipantDeserializer;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* @TODO:
    1. Split this class into a dto with @data and a class @entity;
    2. XML -> JSON -> db;
    3. Getting rid of String is not top priority, but it's still something I must do
    4. Don't forget about deserializers
    5. Entry is the file. Entry has multiple directories, each one of them _must_ have a participant, and additionaly accounts and restrictions. REWORK THAT, DONT FORGET
 */

@Entity
@Table(name = "participant")
@NoArgsConstructor
@AllArgsConstructor
@JsonDeserialize(using = ParticipantDeserializer.class)
public class Participant {

    //If I need something to be not empty, I should add @NonNull before it. Good luck to me

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="participant_id")
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
    @OneToMany(mappedBy = "participant")
    private Set<Account> accounts  = new HashSet<>();

    public void addBank(Account acc){
        accounts.add(acc);
        acc.setParticipant(this);
    }

    public void removeBank(Account acc){
        accounts.remove(acc);
        acc.setParticipant(null);
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
