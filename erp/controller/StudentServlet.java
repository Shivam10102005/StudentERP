package com.erp.controller;

import com.erp.dao.StudentDAO;
import com.erp.model.Student;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    StudentDAO dao=new StudentDAO();

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

        String action=request.getParameter("action");

        if(action.equals("add")){

            String name=request.getParameter("name");
            String roll=request.getParameter("roll");
            String course=request.getParameter("course");
            String year=request.getParameter("year");
            String semester=request.getParameter("semester");

            Student s=new Student(name,roll,course,year,semester);

            dao.addStudent(s);

            response.sendRedirect("viewStudents.jsp");
        }
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

        String action=request.getParameter("action");

        if(action.equals("delete")){

            int id=Integer.parseInt(request.getParameter("id"));

            dao.deleteStudent(id);

            response.sendRedirect("viewStudents.jsp");
        }
    }
}