package java_adv.spring_framework.Task_three.main;

import java.util.*;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java_adv.spring_framework.Task_three.entity.*;

public class JavaApp {

	static int studentId = 701;
	static int courseId = 801;

	public static void execution() {

		Scanner sc = new Scanner(System.in);

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Map<Integer, Student> students = new HashMap<>();
		Map<Integer, Course> courses = new HashMap<>();

		// ---------- Add Student ----------
		String studentName = sc.nextLine();

		Student student = new Student(studentId, studentName);
		students.put(studentId, student);

		System.out.println("Student added successfully");

		// ---------- Add Course 1 ----------
		String courseName1 = sc.next();
		int credits1 = sc.nextInt();

		Course course1 = new Course(courseId, courseName1, credits1);
		courses.put(courseId, course1);

		System.out.println("Course added successfully");

		courseId++;

		// ---------- Add Course 2 ----------
		String courseName2 = sc.next();
		int credits2 = sc.nextInt();

		Course course2 = new Course(courseId, courseName2, credits2);
		courses.put(courseId, course2);

		System.out.println("Course added successfully");

		// ---------- Enroll ----------
		sc.next(); // Enroll keyword
		int sid1 = sc.nextInt();
		int cid1 = sc.nextInt();

		Student s = students.get(sid1);
		Course c = courses.get(cid1);

		if (s != null && c != null) {
			s.getCourses().add(c);
			c.getStudents().add(s);
			System.out.println("Enrollment successful");
		}

		// ---------- Enroll second ----------
		sc.next(); // Enroll keyword
		int sid2 = sc.nextInt();
		int cid2 = sc.nextInt();

		Course c2 = courses.get(cid2);

		if (s != null && c2 != null) {
			s.getCourses().add(c2);
			c2.getStudents().add(s);
			System.out.println("Enrollment successful");
		}

		// ---------- Display Student ----------
		System.out.println();
		System.out.println("Student ID: " + s.getId());
		System.out.println("Name: " + s.getName());

		System.out.println("\nCourses Enrolled:");

		for (Course course : s.getCourses()) {
			System.out.println("  " + course.getCourseName() + " (" + course.getCredits() + " Credits)");
		}

		context.close();
		sc.close();
	}
}