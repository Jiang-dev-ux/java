package week7;

public class Subject {
	private String subjectID;
	private String subjectName;
	
	Subject(String subjectID, String subjectName) {
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
		String msg;
		msg = "¿Î³ÌºÅ£º\t" + subjectID + "    ¿Î³ÌÃû£º\t" + subjectName + "\n";
		return msg;
	}
	
	
}
