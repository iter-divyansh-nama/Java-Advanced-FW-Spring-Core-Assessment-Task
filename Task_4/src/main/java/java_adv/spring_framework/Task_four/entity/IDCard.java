package java_adv.spring_framework.Task_four.entity;

import java.io.Serializable;
import java.util.Objects;

public class IDCard implements Serializable {

    private int id;
    private String cardNumber;
    private String issueDate;

    public IDCard() {}

    public IDCard(int id, String cardNumber, String issueDate) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

	@Override
	public int hashCode() {
		return Objects.hash(cardNumber, id, issueDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IDCard other = (IDCard) obj;
		return Objects.equals(cardNumber, other.cardNumber) && id == other.id
				&& Objects.equals(issueDate, other.issueDate);
	}

	@Override
	public String toString() {
		return "IDCard [id=" + id + ", cardNumber=" + cardNumber + ", issueDate=" + issueDate + "]";
	}
}