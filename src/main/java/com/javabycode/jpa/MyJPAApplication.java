package com.javabycode.jpa;

import com.javabycode.jpa.model.Student;
import com.javabycode.jpa.model.StudentDetail;
import com.javabycode.jpa.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyJPAApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MyJPAApplication.class);

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyJPAApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        // fetch all students before update
        logger.info("============ Fetch all students before update ============");
        for (Student student : studentRepository.findAll()) {
            logger.info(student.toString());
        }

        // save a couple of students
        logger.info("============ Save a couple of students ============");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Student A", new StudentDetail(10)));
        students.add(new Student("Student B", new StudentDetail(11)));
        studentRepository.saveAll(students);

        // fetch all students
        logger.info("============ Fetch all students after update ============");
        for (Student student : studentRepository.findAll()) {
            logger.info(student.toString());
        }
    }
}
