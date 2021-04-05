package week5;

import java.util.Scanner;

public class ClassListDriver {
	public static ClassList list;	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int choose = menu();
			if(choose == 0) {
				System.out.println("Thranks!");
				break;
			}
			switch(choose) {
			case 1: Create();break;
			case 2: Print();break;
			default:System.out.print("Error!Enter again:");
			choose = scan.nextInt();
			}
		}
		
	}
	
	public static int menu() {
		int choose;
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Create List");
		System.out.println("2.Print List");
		System.out.println("0.Exit");
		System.out.print("Enter you choose(0~2):");
		choose = scan.nextInt();
		return choose;
	}
	
	public static void Create() {
		Scanner scan = new Scanner(System.in);
		String temp = null; 
		if(list != null) {
			System.out.println("�Ѵ������Ƿ�����(y/n):");
			temp = scan.next();
			
		}
		if(list == null || temp.equalsIgnoreCase("y")) {
		System.out.print("����ѧ��:");
		int year = scan.nextInt();
		System.out.print("����ѧ��:");
		int semester = scan.nextInt();
		System.out.print("����γ̺�:");
		String SubjectID = scan.next();
		System.out.print("����γ���:");
		String SubjectName = scan.next();
		System.out.print("����ѧ��1ѧ��:");
		String Student1ID = scan.next();
		System.out.print("����ѧ��1����:");
		String Student1Name = scan.next();
		System.out.print("����ѧ��2ѧ��:");
		String Student2ID = scan.next();
		System.out.print("����ѧ��2����:");
		String Student2Name = scan.next();
		Student s1,s2;Subject sub;
		s1 = new Student(Student1ID, Student1Name);
		s2 = new Student(Student2ID, Student2Name);
		sub = new Subject(SubjectID, SubjectName);
		list = new ClassList(year, semester, sub, s1, s2);
		}
		
	}
	
	public static void Print() {
		String Str;
		if(list != null) {
			Str = list.toString();
			System.out.print(Str);
		}
		else
			System.out.println("����ִ�в���1��");
	} 
}
