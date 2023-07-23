package org.example.service;

import org.example.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    Student getStudent(int id)throws Exception;
    List<Student> getAll()throws Exception;
    String insert(Student student) throws Exception;
    String delete(int id)throws Exception;
    String update(int id, Student student)throws Exception;

}
