package com.practice.banks.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "directory")
public class Directory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "directory_id")
    private Long id;

    private String Name;
    private String xmlns;
    private String EDNo;
    private String EDDate;
    private String EDAuthor;
    private String CreationReason;
    private Date CreationDateTime;
    private String InfoTypeCode;
    private Date BusinessDay;
    private String DirectoryVersion;

    @OneToMany(mappedBy = "directory")
    private Set<Participant> participants =  new HashSet<>();

    public void addBank(Participant participant){
        participants.add(participant);
        participant.setDirectory(this);
    }

    public void removeBank(Participant participant){
        participants.remove(participant);
        participant.setDirectory(null);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getEDNo() {
        return EDNo;
    }

    public void setEDNo(String EDNo) {
        this.EDNo = EDNo;
    }

    public String getEDDate() {
        return EDDate;
    }

    public void setEDDate(String EDDate) {
        this.EDDate = EDDate;
    }

    public String getEDAuthor() {
        return EDAuthor;
    }

    public void setEDAuthor(String EDAuthor) {
        this.EDAuthor = EDAuthor;
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

    public Date getBusinessDay() {
        return BusinessDay;
    }

    public void setBusinessDay(Date businessDay) {
        BusinessDay = businessDay;
    }

    public String getDirectoryVersion() {
        return DirectoryVersion;
    }

    public void setDirectoryVersion(String directoryVersion) {
        DirectoryVersion = directoryVersion;
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }
}

