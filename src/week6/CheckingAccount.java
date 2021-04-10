package week6;

public class CheckingAccount extends BankAccount{
	private double serviceCharge;
	
	public CheckingAccount(){
		super();
	}
	
	public CheckingAccount(String accountNum, double serviceCharge){
		super(accountNum, 0);
		this.serviceCharge = serviceCharge;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	
	public void accessServiceCharge() {
		super.setBalance(super.getBalance() - this.getServiceCharge());
	}
	
	public String toString() {
		String msg;
		msg = "卡号: " + super.getAccountNum() + "\n";
		msg += "余额: " + super.getBalance() + "\n";
		msg += "月服务费: " + this.getServiceCharge() + "\n";
		return msg;
	}
}
