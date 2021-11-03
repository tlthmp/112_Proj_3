public class Student {
	private String studentName;
	private String studentID;
	private String year;
	private String town;

	public Student() {
		studentName = "";
		studentID = "";
		year = "";
		town = "";

	}

	public Student(String n, String num, String age, String t) {
		studentName = n;
		studentID = num;
		year = age;
		town = t;
	}

	public void setName(String n) {
		studentName = n;
	}

	public void setID(String num) {
		studentID = num;
	}

	public void setYear(String age) {
		year = age;
	}

	public void setTown(String t) {
		town = t;
	}

	public String getTown() {
		return town;
	}

	public String getName() {
		return studentName;
	}

	public String getID() {
		return studentID;
	}

	public String getYear() {
		return year;
	}

	public String toString() {
		return studentName + ", " + studentID + ", " + year + ", " + town;

	}

}
