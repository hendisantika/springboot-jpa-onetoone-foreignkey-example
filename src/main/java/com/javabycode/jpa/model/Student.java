package com.javabycode.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private final String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_detail_id")
    private StudentDetail studentDetail;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, StudentDetail studentDetail) {
        this.name = name;
        this.studentDetail = studentDetail;
    }
}


