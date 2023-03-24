package unit7;

public class Student {
	
	private String fname, lname, id;
	private int grade;
	private double gpa;
	
	/**
	 * Constructs a Student object given all information
	 * @param fullName - contains first name and last name separated by a space
	 * @param id - contains a unique identification number
	 * @param grade - contains an integer 7 to 12
	 * @param gpa - contains the Student's current gpa
	 */
	public Student(String fullName, String id, int grade, double gpa){
		this.fname = fullName.substring(0, fullName.indexOf(" "));
		this.lname = fullName.substring(fullName.indexOf(" ") + 1);
		this.id = id;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	/**
	 * Returns try if the student is on honor roll, which requires a cumulative
	 * gpa of 3.2 or higher.
	 * @return true if student has honors, false otherwise
	 */
	public boolean hasHonors(){
		if(gpa >= 3.2)
			return true;
		return false;
	}
	
	public String toString(){
		return lname + ", " + fname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	
	
}
