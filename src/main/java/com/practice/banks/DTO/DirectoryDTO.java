package com.practice.banks.DTO;

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
public class DirectoryDTO {
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
    private Set<Bank> banks;
}
