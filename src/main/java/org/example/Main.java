package org.example;

import org.example.service.StudentService;
import org.example.service.StudentServiceImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentService service = new StudentServiceImpl();
        System.out.println(service.getStudent(3));
    }
}