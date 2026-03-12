package java_adv.spring_framework.Task_one.entity;

import java.io.Serializable;
import java.util.Objects;

public class Course implements Serializable{

    private int id;
    private String courseName;
    private int credits;

    public Course() {}

    public Course(int id, String courseName, int credits) {
        this.id = id;
        this.courseName = courseName;
        this.credits = credits;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", credits=" + credits + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseName, credits, id);
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
		return Objects.equals(courseName, other.courseName) && credits == other.credits && id == other.id;
	}
    
}