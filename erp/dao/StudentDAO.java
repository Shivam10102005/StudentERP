package com.erp.dao;

import com.erp.model.Student;
import com.erp.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    Connection con = DBConnection.getConnection();

    public void addStudent(Student s){

        try{

            String sql="insert into students(name,roll,course,year,semester) values(?,?,?,?,?)";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(1,s.getName());
            ps.setString(2,s.getRoll());
            ps.setString(3,s.getCourse());
            ps.setString(4,s.getYear());
            ps.setString(5,s.getSemester());

            ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public List<Student> getAllStudents(){

        List<Student> list=new ArrayList<>();

        try{

            String sql="select * from students";

            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery(sql);

            while(rs.next()){

                Student s=new Student();

                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setRoll(rs.getString("roll"));
                s.setCourse(rs.getString("course"));
                s.setYear(rs.getString("year"));
                s.setSemester(rs.getString("semester"));

                list.add(s);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public void deleteStudent(int id){

        try{

            String sql="delete from students where id=?";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setInt(1,id);

            ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}