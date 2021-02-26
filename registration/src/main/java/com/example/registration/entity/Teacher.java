package com.example.registration.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "teachers")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Teacher extends User{
    private int experiences;

    private String phone;
}
