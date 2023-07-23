package org.example.service;

import org.example.model.Student;
import org.example.repository.Datasource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class StudentServiceImpl extends Datasource implements StudentService{
    private final Connection conn = getConnection();
    @Override
    public Student getStudent() {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public String insert(Student student) throws Exception {
        PreparedStatement st = conn.prepareStatement("insert into student (name,age) values(?,?)");
        st.setString(1, student.getName());
        st.setInt(2,student.getAge());
        st.execute();
        return "telebe yaradildi";
    }

    @Override
    public String delete(int id) {
        return null;
    }

    @Override
    public String update(int id, Student student) {
        return null;
    }
}
