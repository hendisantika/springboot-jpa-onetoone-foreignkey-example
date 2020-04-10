package com.javabycode.jpa.controller;

import com.javabycode.jpa.model.Student;
import com.javabycode.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jpa-onetoone-foreignkey-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/10/17
 * Time: 22.57
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public String index() {
        List<Student> hasilnya = studentRepository.findAll();
        return "Waktu saat ini " + new Date() + "\n" + hasilnya;
    }

    @GetMapping(params = "nama")
    public Student filterByName(@RequestParam("nama") String nama) {
        return studentRepository.findByName(nama);
    }
}
