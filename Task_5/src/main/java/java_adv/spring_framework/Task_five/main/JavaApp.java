package java_adv.spring_framework.Task_five.main;

import java.util.*;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java_adv.spring_framework.Task_five.entity.*;

public class JavaApp {

    static Map<Integer, School> schools = new HashMap<>();
    static int schoolId = 401;
    static int studentId = 101;

    public static void execution() {

        Scanner sc = new Scanner(System.in);

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // -------- Add School with Students --------
        String schoolName = sc.next();
        String city = sc.next();
        int numberOfStudents = sc.nextInt();

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < numberOfStudents; i++) {

            String studentName = sc.next();
            int grade = sc.nextInt();

            Student s = new Student(studentId++, studentName, grade);
            studentList.add(s);
        }

        School school = new School(schoolId, schoolName, city, studentList);
        schools.put(schoolId, school);

        System.out.println("School added successfully");

        System.out.println("School ID: " + school.getId());
        System.out.println("Name: " + school.getName());
        System.out.println("City: " + school.getCity());

        System.out.println("\nStudents:");

        for (Student s : school.getStudents()) {
            System.out.println("  " + s.getName() + " - Grade " + s.getGrade());
        }

        // -------- Search School --------
        int searchId = sc.nextInt();

        School searched = schools.get(searchId);

        if (searched != null) {

            System.out.println("School ID: " + searched.getId());
            System.out.println("Name: " + searched.getName());
            System.out.println("City: " + searched.getCity());

            System.out.println("\nStudents:");

            for (Student s : searched.getStudents()) {
                System.out.println("  " + s.getName() + " - Grade " + s.getGrade());
            }
        }

        // -------- Add Student --------
        int sId = sc.nextInt();
        String newStudentName = sc.next();
        int newGrade = sc.nextInt();

        School targetSchool = schools.get(sId);

        if (targetSchool != null) {

            Student newStudent = new Student(studentId++, newStudentName, newGrade);
            targetSchool.getStudents().add(newStudent);

            System.out.println("Student added successfully");
        }

        // -------- Delete School --------
        int deleteId = sc.nextInt();

        if (schools.remove(deleteId) != null) {
            System.out.println("School deleted successfully");
        }

        context.close();
        sc.close();
    }
}