package beans;

public class Profile {
private Educational educationalInfo;
private Personal personalInfo;
public Profile() {

	// TODO Auto-generated constructor stub
}
public Profile(Educational educationalInfo, Personal personalInfo) {
	super();
	this.educationalInfo = educationalInfo;
	this.personalInfo = personalInfo;
}
public Educational getEducationalInfo() {
	return educationalInfo;
}
public void setEducationalInfo(Educational educationalInfo) {
	this.educationalInfo = educationalInfo;
}
public Personal getPersonalInfo() {
	return personalInfo;
}
public void setPersonalInfo(Personal personalInfo) {
	this.personalInfo = personalInfo;
}
@Override
public String toString() {
	return "Profile [educationalInfo=" + educationalInfo + ", personalInfo=" + personalInfo + "]";
}


}
