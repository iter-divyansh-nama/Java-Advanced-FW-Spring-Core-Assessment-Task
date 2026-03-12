package java_adv.spring_framework.Task_one.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java_adv.spring_framework.Task_one.entity.*;

public class JavaApp {

    public static void execution() {

        String xmlConfigurationfile = "applicationContext.xml";
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(xmlConfigurationfile);

        Department dept = (Department) context.getBean("department");
        Course course = (Course) context.getBean("course1");
        Student student = (Student) context.getBean("student");

        System.out.println("Department added successfully");
        System.out.println("Department ID: " + dept.getId());
        System.out.println("Name: " + dept.getName());
        System.out.println();

      
        System.out.println("Course added successfully");
        System.out.println("Course ID: " + course.getId());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Credits: " + course.getCredits());
        System.out.println("Department: " + dept.getName());
        System.out.println();

     
        System.out.println("Student added successfully");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Name: " + student.getName());

        System.out.println("\nProfile:");
        System.out.println("  Email: " + student.getProfile().getEmail());
        System.out.println("  Phone: " + student.getProfile().getPhone());

        System.out.println("\nDepartment:");
        System.out.println("  Name: " + student.getDepartment().getName());
        System.out.println();

        System.out.println("Enrollment successful");
        System.out.println();

    
        System.out.println("Student ID: " + student.getId());
        System.out.println("Name: " + student.getName());

        System.out.println("\nProfile:");
        System.out.println("  Email: " + student.getProfile().getEmail());
        System.out.println("  Phone: " + student.getProfile().getPhone());

        System.out.println("\nDepartment:");
        System.out.println("  Name: " + student.getDepartment().getName());

        System.out.println("\nCourses Enrolled:");

        for (Course c : student.getCourses()) {
            System.out.println("  " + c.getCourseName() + " (" + c.getCredits() + " Credits)");
        }

        context.close();
    }
}