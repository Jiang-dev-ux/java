package week4_work2;

public class UserDriver {
	public static void main(String args[]) {
		User user1 = new User();
		User user2 = new User("����");
		User user3 = new User("����","123456789");
		
		user3.updatePassWord("987654321");
		System.out.println(user3.getUserName() +"'s password is "+ user3.getPassWord());
		
		user2.updateUserName("����");
		
		System.out.println("membernumber is: " + user1.getMemberNumber());
		user1.displayUser();
		user2.displayUser();
		user3.displayUser();
		
	}
}
