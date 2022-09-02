package com.example.di.dependencyinjection_using_settermethod;

public class Student {
   private String studentName;
    private  int id;



    public void setId(int id) {
        this.id = id;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void displayInfo() {
        System.out.println("Student Name is: " + studentName+" "+"& Student Id is: "+id);
    }
}