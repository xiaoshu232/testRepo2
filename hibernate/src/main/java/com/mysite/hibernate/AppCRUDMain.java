package com.mysite.hibernate;

import java.util.List;


 
public class AppCRUDMain {
 
 
    public static void main(String[] args) {
        System.out.println(".......Hibernate Crud Operations Example.......\n");
 
        System.out.println("\n=======CREATE RECORDS=======\n");
        DbOperations.createRecord();
 
        System.out.println("\n=======READ RECORDS=======\n");
        List<Student> viewStudents = DbOperations.displayRecords();
        if(viewStudents != null & viewStudents.size() > 0) {
            for(Student studentObj : viewStudents) {
                System.out.println(studentObj.toString());
            }
        }
 
      
        System.out.println("\n=======Done=======\n");
        System.exit(0);
    } 
}
