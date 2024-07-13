package com.practice.banks.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/*
    Dictionary has multiple entries; @OneToMany entry-
 */
@NoArgsConstructor
@AllArgsConstructor
@Table(name="dictionary")
@Entity
public class Dictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dictionary_id")
    private Long id;
    @Lob
    private byte[] file; // actual file;

    private String name; //just a name
    private String EDNo; //9-digit number
    private Date EDDate; //YYYY-MM-DD
    private String EDAuthor; //10-digit number;
    private String EDReceiver; //10-digit number
    private String CreationReason; //4-digit number
    private Date CreationDateTime; //DIFFERENT TYPE! YYYY-MM-DD hh:mm:ss
    private String InfoTypeCode; // 4-digit number;
    private String BusinessDay; // YYYY-MM-DD;
    private String DirectoryVersion; //small-digit number;

    @OneToMany(mappedBy = "dictionary")
    private Set<Entry> entries = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEDNo() {
        return EDNo;
    }

    public void setEDNo(String EDNo) {
        this.EDNo = EDNo;
    }

    public Date getEDDate() {
        return EDDate;
    }

    public void setEDDate(Date EDDate) {
        this.EDDate = EDDate;
    }

    public String getEDAuthor() {
        return EDAuthor;
    }

    public void setEDAuthor(String EDAuthor) {
        this.EDAuthor = EDAuthor;
    }

    public String getEDReceiver() {
        return EDReceiver;
    }

    public void setEDReceiver(String EDReceiver) {
        this.EDReceiver = EDReceiver;
    }

    public String getCreationReason() {
        return CreationReason;
    }

    public void setCreationReason(String creationReason) {
        CreationReason = creationReason;
    }

    public Date getCreationDateTime() {
        return CreationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        CreationDateTime = creationDateTime;
    }

    public String getInfoTypeCode() {
        return InfoTypeCode;
    }

    public void setInfoTypeCode(String infoTypeCode) {
        InfoTypeCode = infoTypeCode;
    }

    public String getBusinessDay() {
        return BusinessDay;
    }

    public void setBusinessDay(String businessDay) {
        BusinessDay = businessDay;
    }

    public String getDirectoryVersion() {
        return DirectoryVersion;
    }

    public void setDirectoryVersion(String directoryVersion) {
        DirectoryVersion = directoryVersion;
    }

    public Set<Entry> getEntries() {
        return entries;
    }

    public void setEntries(Set<Entry> entries) {
        this.entries = entries;
    }
}
