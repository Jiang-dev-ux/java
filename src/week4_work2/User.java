package week4_work2;

import java.util.Scanner;

class User {
	private String username;
	private String password;
	private static int membernumebr = 0;
	

	public User() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your username: ");
		this.username = scan.next();
		System.out.print("Please enter your password: ");
		this.password = scan.next();
		membernumebr++;
	}

	public User(String username) {
		Scanner scan = new Scanner(System.in);
		this.username = username;
		System.out.print("Please Enter the password with the user name " + this.username + ": ");
		this.password = scan.next();
		System.out.println();
		membernumebr++;
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		membernumebr++;
	}

	public String getUserName() {
		return this.username;
	}

	public String getPassWord() {
		return this.password;
	}

	public int getMemberNumber() {
		return membernumebr;
	}

	public void updateUserName(String username) {
		this.username = username;
	}

	public void updatePassWord(String password) {
		this.password = password;
	}
	
	public void displayUser() {
		System.out.println("username: " + username + "  password: " + password);
	}
}
