package beans;

public class Personal {
private String firstName, lastName, emailAddress;


public Personal() {

	// TODO Auto-generated constructor stub
}


public Personal(String firstName, String lastName, String emailAddress) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailAddress = emailAddress;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getEmailAddress() {
	return emailAddress;
}


public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}


@Override
public String toString() {
	return "Persoal [firstName=" + firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress + "]";
}



	
}
