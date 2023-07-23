package org.example;

import org.example.model.Student;
import org.example.service.StudentService;
import org.example.service.StudentServiceImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setName("Ilkin");
        student.setAge(50);
        StudentService service = new StudentServiceImpl();
        System.out.println(service.insert(student));
    }
}