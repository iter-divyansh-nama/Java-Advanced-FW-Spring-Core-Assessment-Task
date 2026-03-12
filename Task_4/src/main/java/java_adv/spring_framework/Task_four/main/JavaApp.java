package java_adv.spring_framework.Task_four.main;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java_adv.spring_framework.Task_four.entity.*;


public class JavaApp {

    public static void execution() {

        Scanner sc = new Scanner(System.in);

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        int empId = 201;
        int cardId = 301;

        // -------- Add Employee --------
        String name = sc.next();
        String department = sc.next();
        String cardNumber = sc.next();
        String issueDate = sc.next();

        Employee emp = new Employee(empId, name, department);
        IDCard card = new IDCard(cardId, cardNumber, issueDate);

        emp.setIdCard(card);

        System.out.println("Employee added successfully");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());

        System.out.println("ID Card:");
        System.out.println("  Card Number: " + card.getCardNumber());
        System.out.println("  Issue Date: " + card.getIssueDate());

        // -------- Update Issue Date --------
        int employeeId = sc.nextInt();
        String newIssueDate = sc.next();

        if (employeeId == emp.getId()) {
            emp.getIdCard().setIssueDate(newIssueDate);
            System.out.println("IDCard updated successfully");
        }

        // -------- Delete Employee --------
        int deleteId = sc.nextInt();

        if (deleteId == emp.getId()) {
            emp = null;
            System.out.println("Employee deleted successfully");
        }

        context.close();
        sc.close();
    }
}