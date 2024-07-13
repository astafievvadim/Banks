package com.practice.banks.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "restriction")
@NoArgsConstructor
@AllArgsConstructor
public class Restriction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restriction_id")
    private Long id;

    private String rstr;
    private Date rstrDate;

    @OneToOne
    private Entry entry;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRstr() {
        return rstr;
    }

    public void setRstr(String rstr) {
        this.rstr = rstr;
    }

    public Date getRstrDate() {
        return rstrDate;
    }

    public void setRstrDate(Date rstrDate) {
        this.rstrDate = rstrDate;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }
}
