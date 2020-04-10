package com.javabycode.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetail {
    @Column(name = "age")
    private final Integer age;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne(mappedBy = "studentDetail")
    private Student student;

    public StudentDetail(Integer age) {
        this.age = age;
    }
}
