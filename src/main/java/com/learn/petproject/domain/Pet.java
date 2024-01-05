package com.learn.petproject.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Data
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String species;

    private String petName;

    private String color;

    private Date admitDate;

    private Date dischargeDate;

    private String ownerPhoneNumber;

    private String ownerName;
}
