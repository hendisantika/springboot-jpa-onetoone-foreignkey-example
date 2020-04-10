package com.javabycode.jpa.repository;

import com.javabycode.jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByName(String name);
}
