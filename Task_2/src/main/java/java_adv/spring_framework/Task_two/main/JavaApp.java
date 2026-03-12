package java_adv.spring_framework.Task_two.main;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java_adv.spring_framework.Task_two.entity.*;

public class JavaApp {

    static int deptId = 101;
    static int empId = 501;

    public static void execution() {

        Scanner sc = new Scanner(System.in);

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

       
        String deptName = sc.next();
        String location = sc.next();

        Department dept = new Department(deptId, deptName, location);

        System.out.println("Department added successfully");

 
        String empName = sc.next();
        double salary = sc.nextDouble();
        int departmentId = sc.nextInt();

        if (departmentId != deptId) {
            System.out.println("Department not found");
            context.close();
            sc.close();
            return;
        }

        Employee emp = new Employee(empId, empName, salary);
        emp.setDepartment(dept);

        System.out.println("Employee added successfully");

   
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        System.out.println("\nDepartment:");
        System.out.println("  Name: " + emp.getDepartment().getName());
        System.out.println("  Location: " + emp.getDepartment().getLocation());

        context.close();
        sc.close();
    }
}