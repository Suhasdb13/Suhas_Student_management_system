package com.nitalneteork.demo.controller;

import com.nitalneteork.demo.entity.Student;
import com.nitalneteork.demo.payload.StudentDto;
import com.nitalneteork.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/v1")
public class StudentController {
    private  StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
      Student addStudent=studentService.addStudent(student);
      return ResponseEntity.ok(addStudent);
    }

    @GetMapping("/getstudent/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable("name") String name){
        Student studentByName=studentService.getStudentByName(name);
        return ResponseEntity.ok(studentByName);
    }

   @PutMapping("/updateStudent")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        Student updateStudent=studentService.updateStudent((student));
        return ResponseEntity.ok(updateStudent);
   }

   @GetMapping("/listall")
    public List<Student> getStudents(){
        List<Student> students=studentService.getStudents();
        return students;
   }

   @DeleteMapping("/delete/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudentById(id);
        return ResponseEntity.ok().build();
   }

}
