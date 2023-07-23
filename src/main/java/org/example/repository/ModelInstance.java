package org.example.repository;

import org.example.service.StudentService;
import org.example.service.StudentServiceImpl;

public class ModelInstance {
    public static StudentService instanceOfStudent(){
        return new StudentServiceImpl();
    }
}
