package com.practice.banks.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

/* @TODO:
    1. Split this class into a dto with @data and a class @entity;
    2. XML -> JSON -> db;
    3. Getting rid of String is not top priority, but it's still something I must do
    4. Don't forget about deserializers
    5. Dictionary is the file. Dictionary has multiple entries*, each one of them _must_ have a participant, and additionaly accounts and restrictions. REWORK THAT, DONT FORGET
 */

@Entity
@Table(name = "participant")
@NoArgsConstructor
@AllArgsConstructor

public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="participant_id")
    private Long id;

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

    @OneToOne(mappedBy = "participant")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Entry entry;

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

    public String getEnglName() {
        return EnglName;
    }

    public void setEnglName(String englName) {
        EnglName = englName;
    }

    public String getRegN() {
        return RegN;
    }

    public void setRegN(String regN) {
        RegN = regN;
    }

    public String getCntrCd() {
        return CntrCd;
    }

    public void setCntrCd(String cntrCd) {
        CntrCd = cntrCd;
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

    public Date getDateOut() {
        return DateOut;
    }

    public void setDateOut(Date dateOut) {
        DateOut = dateOut;
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

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }
}
