package java_adv.spring_framework.Task_three.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Course implements Serializable {

    private int id;
    private String courseName;
    private int credits;
    private Set<Student> students = new HashSet<>();

    public Course() {}

    public Course(int id, String courseName, int credits) {
        this.id = id;
        this.courseName = courseName;
        this.credits = credits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

	@Override
	public int hashCode() {
		return Objects.hash(courseName, credits, id, students);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseName, other.courseName) && credits == other.credits && id == other.id
				&& Objects.equals(students, other.students);
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", credits=" + credits + "]";
	}
}