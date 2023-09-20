package com.example.g10170123ebelesson12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student1 = context.getBean(Student.class);
        Student student2 = context.getBean(Student.class);
        student1.setName("Alina");
        student1.setAge(19);
        System.out.printf("Student name: %s, student age: %d", student2.getName(), student2.getAge());
    }
}
