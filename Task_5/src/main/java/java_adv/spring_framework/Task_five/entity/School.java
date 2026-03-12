package java_adv.spring_framework.Task_five.entity;


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class School implements Serializable {

    private int id;
    private String name;
    private String city;
    private List<Student> students;

    public School() {}

    public School(int id, String name, String city, List<Student> students) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

	@Override
	public int hashCode() {
		return Objects.hash(city, id, name, students);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(students, other.students);
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}