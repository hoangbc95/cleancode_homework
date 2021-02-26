package com.example.registration.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "students")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Student extends User{
    private int year;
}
