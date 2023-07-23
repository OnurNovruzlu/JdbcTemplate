package org.example.service;

import org.example.model.Student;
import org.example.repository.Datasource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class StudentServiceImpl extends Datasource implements StudentService{
    private final Connection conn = getConnection();
    @Override
    public Student getStudent(int id) throws Exception{
        Student student = new Student();
        String query = "select * from student where id = "+id;
        PreparedStatement st = conn.prepareStatement(query);

        ResultSet rs = st.executeQuery();
        while(rs.next()){
            student.setId(rs.getInt(1));
            student.setName(rs.getString(2));
            student.setAge(rs.getInt(3));
        }
        return student;
    }

    @Override
    public List<Student> getAll() throws Exception{
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
    public String delete(int id) throws Exception{
        return null;
    }

    @Override
    public String update(int id, Student student) throws Exception{
        return null;
    }
}
