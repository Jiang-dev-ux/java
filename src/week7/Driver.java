package week7;

import java.util.Scanner;

public class Driver {
	static Scanner scan = new Scanner(System.in);
	public static Enrolment list;

	public static void main(String args[]) {
		int choose;
		while (true) {
			choose = menu();
			if (choose == 0) {
				System.out.println("感谢使用！");
				break;
			}
			switch (choose) {
			case 1:
				createSubject();
				break;
			case 2:
				if (list == null)
					System.out.println("请先创建课程！");
				else
					chooseSubject();
				break;
			case 3:
				if (list == null)
					System.out.println("请先创建课程！");
				else
					exitSubject();
				break;
			case 4:
				if (list == null)
					System.out.println("请先创建课程！");
				else
					deleteSubject();
				break;
			case 5:
				if (list == null)
					System.out.println("请先创建课程！");
				else
					displaySubject();
				break;
			default:
				System.out.println("错误，请重新输入！(0~5)");
				break;
			}
		}
	}

	public static int menu() {
		int choose = 0;
		System.out.println("====WTU选课系统====");
		System.out.println("1.创建课程");
		System.out.println("2.选课");
		System.out.println("3.退选");
		System.out.println("4.删除课程");
		System.out.println("5.打印");
		System.out.println("0.退出");
		System.out.print("输入选择(0~5):");
		choose = scan.nextInt();
		return choose;
	}

	public static void createSubject() {
		list = new Enrolment(10);
		System.out.print("输入课程号：");
		String subjectID = scan.next();
		System.out.print("输入课程名：");
		String subjectName = scan.next();
		System.out.print("输入课程容量：");
		int capacity = scan.nextInt();
		Subject subject = new Subject(subjectID, subjectName);
		SubjectList subjectlist = new SubjectList(subject, capacity);
		if (!list.boolID(subjectID) || !list.boolName(subjectName)) {
			list.add(subjectlist);
			System.out.println("成功！");
			System.out.println(list.toString());
		} else
			System.out.println("失败！课程名或课程号重复！");

	}

	public static void chooseSubject() {
		System.out.print("输入课程号：");
		String subjectID = scan.next();
		int index = list.found(subjectID);
		if (index != -1) {
			System.out.print("输入学号：");
			String studentID = scan.next();
			System.out.print("输入姓名：");
			String studentName = scan.next();
			Student student = new Student(studentID, studentName);
			if (list.getList()[index].add(student)) {				
				System.out.println("成功！");
			} else
				System.out.println("失败！该学生已选或没有余量");
		} else
			System.out.println("失败！该课程不存在！");
	}

	public static void exitSubject() {
		System.out.print("输入课程号：");
		String subjectID = scan.next();
		int index = list.found(subjectID);
		if (index != -1) {
			System.out.print("输入学号：");
			String studentID = scan.next();
			if (list.getList()[index].remove(studentID)) {
				System.out.println("成功！");
			} else {
				System.out.println("失败！该学生不存在或未选该课");
			}
		} else
			System.out.println("失败！该课程不存在！");
	}

	public static void deleteSubject() {
		System.out.print("输入课程号：");
		String subjectID = scan.next();
		if (list.boolID(subjectID)) {
			list.remove(subjectID);
			System.out.println("成功！");
		} else
			System.out.println("失败！该课程未创建！");
	}

	public static void displaySubject() {
		System.out.println(list.toString());
	}
}
