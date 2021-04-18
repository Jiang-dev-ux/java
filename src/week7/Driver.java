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
				System.out.println("��лʹ�ã�");
				break;
			}
			switch (choose) {
			case 1:
				createSubject();
				break;
			case 2:
				if (list == null)
					System.out.println("���ȴ����γ̣�");
				else
					chooseSubject();
				break;
			case 3:
				if (list == null)
					System.out.println("���ȴ����γ̣�");
				else
					exitSubject();
				break;
			case 4:
				if (list == null)
					System.out.println("���ȴ����γ̣�");
				else
					deleteSubject();
				break;
			case 5:
				if (list == null)
					System.out.println("���ȴ����γ̣�");
				else
					displaySubject();
				break;
			default:
				System.out.println("�������������룡(0~5)");
				break;
			}
		}
	}

	public static int menu() {
		int choose = 0;
		System.out.println("====WTUѡ��ϵͳ====");
		System.out.println("1.�����γ�");
		System.out.println("2.ѡ��");
		System.out.println("3.��ѡ");
		System.out.println("4.ɾ���γ�");
		System.out.println("5.��ӡ");
		System.out.println("0.�˳�");
		System.out.print("����ѡ��(0~5):");
		choose = scan.nextInt();
		return choose;
	}

	public static void createSubject() {
		list = new Enrolment(10);
		System.out.print("����γ̺ţ�");
		String subjectID = scan.next();
		System.out.print("����γ�����");
		String subjectName = scan.next();
		System.out.print("����γ�������");
		int capacity = scan.nextInt();
		Subject subject = new Subject(subjectID, subjectName);
		SubjectList subjectlist = new SubjectList(subject, capacity);
		if (!list.boolID(subjectID) || !list.boolName(subjectName)) {
			list.add(subjectlist);
			System.out.println("�ɹ���");
			System.out.println(list.toString());
		} else
			System.out.println("ʧ�ܣ��γ�����γ̺��ظ���");

	}

	public static void chooseSubject() {
		System.out.print("����γ̺ţ�");
		String subjectID = scan.next();
		int index = list.found(subjectID);
		if (index != -1) {
			System.out.print("����ѧ�ţ�");
			String studentID = scan.next();
			System.out.print("����������");
			String studentName = scan.next();
			Student student = new Student(studentID, studentName);
			if (list.getList()[index].add(student)) {				
				System.out.println("�ɹ���");
			} else
				System.out.println("ʧ�ܣ���ѧ����ѡ��û������");
		} else
			System.out.println("ʧ�ܣ��ÿγ̲����ڣ�");
	}

	public static void exitSubject() {
		System.out.print("����γ̺ţ�");
		String subjectID = scan.next();
		int index = list.found(subjectID);
		if (index != -1) {
			System.out.print("����ѧ�ţ�");
			String studentID = scan.next();
			if (list.getList()[index].remove(studentID)) {
				System.out.println("�ɹ���");
			} else {
				System.out.println("ʧ�ܣ���ѧ�������ڻ�δѡ�ÿ�");
			}
		} else
			System.out.println("ʧ�ܣ��ÿγ̲����ڣ�");
	}

	public static void deleteSubject() {
		System.out.print("����γ̺ţ�");
		String subjectID = scan.next();
		if (list.boolID(subjectID)) {
			list.remove(subjectID);
			System.out.println("�ɹ���");
		} else
			System.out.println("ʧ�ܣ��ÿγ�δ������");
	}

	public static void displaySubject() {
		System.out.println(list.toString());
	}
}
