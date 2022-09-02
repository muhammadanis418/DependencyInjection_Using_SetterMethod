package com.example.di.dependencyinjection_using_settermethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student s1 = applicationContext.getBean("student1", Student.class);
        s1.displayInfo();

        Student s2 = applicationContext.getBean("student2", Student.class);
        s2.displayInfo();

        Student s3 = applicationContext.getBean("student3", Student.class);
        s3.displayInfo();

    //    Student s4 = applicationContext.getBean("student4", Student.class);
     //   s4.displayInfo();
      Student s4=  (Student)applicationContext.getBean("student4");
      s4.displayInfo();


    }
}
