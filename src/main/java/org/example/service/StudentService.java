package org.example.service;

import org.example.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    Student getStudent();
    List<Student> getAll();
    String insert(Student student) throws Exception;
    String delete(int id);
    String update(int id, Student student);

}
