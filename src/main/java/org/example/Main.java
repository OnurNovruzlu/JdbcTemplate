package org.example;

import org.example.model.Student;
import org.example.repository.ModelInstance;
import org.example.service.StudentService;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentService service = ModelInstance.instanceOfStudent();
        Student student = new Student();
        student.setName("Salam");
        student.setAge(12);
        System.out.println(service.update(1,student));
    }
}