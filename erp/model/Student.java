package com.erp.model;

public class Student {

    private int id;
    private String name;
    private String roll;
    private String course;
    private String year;
    private String semester;

    public Student(){}

    public Student(String name,String roll,String course,String year,String semester){
        this.name=name;
        this.roll=roll;
        this.course=course;
        this.year=year;
        this.semester=semester;
    }

    public int getId(){ return id; }
    public void setId(int id){ this.id=id; }

    public String getName(){ return name; }
    public void setName(String name){ this.name=name; }

    public String getRoll(){ return roll; }
    public void setRoll(String roll){ this.roll=roll; }

    public String getCourse(){ return course; }
    public void setCourse(String course){ this.course=course; }

    public String getYear(){ return year; }
    public void setYear(String year){ this.year=year; }

    public String getSemester(){ return semester; }
    public void setSemester(String semester){ this.semester=semester; }
}