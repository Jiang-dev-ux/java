package week5;

class Subject {
	private String subjectID;
	private String subjectName;
	
	public Subject(String subjectID, String subjectName) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
	}

	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String toString() {
		return "Subject [subjectID=" + subjectID + ", subjectName=" + subjectName + "]";
	}
	
	
}
