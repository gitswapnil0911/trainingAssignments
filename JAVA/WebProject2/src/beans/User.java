package beans;

public class User {
	private UserCredentials  userCredntials;
	private String firstName, lastName, emailAddress;
	public User(UserCredentials userCredntials, String firstName, String lastName, String emailAddress) {
		super();
		this.userCredntials = userCredntials;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}
	public User() {
	
		// TODO Auto-generated constructor stub
	}
	public UserCredentials getUserCredntials() {
		return userCredntials;
	}
	public void setUserCredntials(UserCredentials userCredntials) {
		this.userCredntials = userCredntials;
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
		return "User [userCredntials=" + userCredntials + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailAddress=" + emailAddress + "]";
	}
	
}
