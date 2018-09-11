package com.crud.app.dao;

import java.util.List;

import com.crud.app.model.Student;

public interface StudentDAO {

 void addStudent(Student student);
 
 void updateStudent(Student student);
 
 void deleteStudent(Student student);
 
 List<Student> getAllStudents();
 
 Student getStudentById(long id);
 
}