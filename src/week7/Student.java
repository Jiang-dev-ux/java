package week7;

class Student {
	private String studentID;
	private String studentName;
	
	public Student(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	public String toString() {
		String msg;
		msg = "ѧ�ţ�\t" + studentID + "    ������\t" + studentName + "\n";
		return msg;
	}
	
}
