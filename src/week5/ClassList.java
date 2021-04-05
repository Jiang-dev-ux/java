package week5;

public class ClassList {
	private int semester;
	private int year;
	private Subject sub;
	private Student s1;
	private Student s2;
	
	public ClassList(int year, int semester, Subject sub, Student s1, Student s2) {
		this.year = year;
		this.semester = semester;
		this.sub = sub;
		this.s1 = s1;
		this.s2 = s2;
	}

	public String toString() {
		String msg;
		msg = "学年:\t" + year + "学期:\t" + semester + "\n";
		msg += "课程号:\t" + sub.getSubjectID() + "课程名:\t" + sub.getSubjectName() + "\n";
		msg += "====================\n";
		msg += "学号:\t" +s1.getStudentID() + "姓名:\t" + s1.getStudentName() + "\n";
		msg += "学号:\t" +s2.getStudentID() + "姓名:\t" + s2.getStudentName() + "\n";
		return msg;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	public Student getS1() {
		return s1;
	}

	public void setS1(Student s1) {
		this.s1 = s1;
	}

	public Student getS2() {
		return s2;
	}

	public void setS2(Student s2) {
		this.s2 = s2;
	}
}
