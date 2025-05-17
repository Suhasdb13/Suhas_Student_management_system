package com.nitalneteork.demo.repository;

import com.nitalneteork.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public Student findStudentByName(String name);
}
