package com.sabin.sms.service;

import java.util.List;

import com.sabin.sms.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    //void saveStudent(Student student);
    
    Student saveStudent(Student student);
    
    Student getStudentById(Long id);
    
    Student updateStudent(Student student);
   public  void deleteStudent(Long id);
}
