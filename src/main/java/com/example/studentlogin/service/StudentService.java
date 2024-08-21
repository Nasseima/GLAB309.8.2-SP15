package com.example.studentlogin.service;


import com.example.studentlogin.dto.StudentDto;
import com.example.studentlogin.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDto studentDto);
    Student findStudentByEmail(String email);
    List<StudentDto> findAllStudents();
}




