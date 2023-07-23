package org.example.service;

import org.example.model.Student;
import org.example.repository.Datasource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl extends Datasource implements StudentService{
    private final Connection conn = getConnection();
    @Override
    public Student getStudent(int id) throws Exception{
        Student student = new Student();
        String query = "select * from student where id = "+id;
        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            student.setId(rs.getInt(1));
            student.setName(rs.getString(2));
            student.setAge(rs.getInt(3));
        }
        return student;
    }

    @Override
    public List<Student> getAll() throws Exception{
        List<Student> list = new ArrayList<>();
        String query = "select * from student";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()){
            Student student = new Student();
            student.setId(rs.getInt(1));
            student.setName(rs.getString(2));
            student.setAge(rs.getInt(3));
            list.add(student);
        }
        return list;
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
        String query = "delete from student where id = "+id;
        Statement st = conn.createStatement();
        st.execute(query);
        return "telebe silindi";
    }

    @Override
    public String update(int id, Student student) throws Exception{
        String query = "update student set name = ?,age = ? where id = ?";
        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1,student.getName());
        st.setInt(2,student.getAge());
        st.setInt(3,id);
        st.execute();
        return "telebe guncellendi";
    }
}
