package com.example.library_management.services;

import com.example.library_management.entities.Student;
import com.example.library_management.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById((long) id).orElse(null);
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById((long) id);
    }

    public Student createStudent(Student student) {

        return studentRepository.save(student);
    }

    public Student updateStudent(int id, Student student) {

            return studentRepository.save(student);
    }
}