package java_adv.spring_framework.Task_one.entity;

import java.io.Serializable;
import java.util.Objects;

public class StudentProfile implements Serializable {

    private int id;
    private String email;
    private String phone;

    public StudentProfile() {}

    public StudentProfile(int id, String email, String phone) {
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    
    public void setPhone(String phone) { this.phone = phone; }

	@Override
	public String toString() {
		return "StudentProfile [id=" + id + ", email=" + email + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentProfile other = (StudentProfile) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(phone, other.phone);
	}
    
}