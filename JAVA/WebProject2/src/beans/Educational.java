package beans;

public class Educational {
private String qualification, university;

public Educational() {

	// TODO Auto-generated constructor stub
}

public Educational(String qualification, String university) {
	super();
	this.qualification = qualification;
	this.university = university;
}

public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}

public String getUniversity() {
	return university;
}

public void setUniversity(String university) {
	this.university = university;
}

@Override
public String toString() {
	return "Educational [qualification=" + qualification + ", university=" + university + "]";
}



}
