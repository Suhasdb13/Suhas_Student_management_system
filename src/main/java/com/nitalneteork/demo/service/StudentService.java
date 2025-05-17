package com.nitalneteork.demo.service;

import com.nitalneteork.demo.entity.Student;
import com.nitalneteork.demo.payload.StudentDto;
import com.nitalneteork.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student){
       return studentRepository.save(student);
    }

    public Student getStudentByName(String name) {
         return studentRepository.findStudentByName( name);

    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(Math.toIntExact(id));
    }
}
