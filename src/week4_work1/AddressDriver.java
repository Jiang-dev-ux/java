package week4_work1;

public class AddressDriver {
	public static void main(String args[]) {
		Address Add1 = new Address();
		Address Add2 = new Address("China", "Hubei", "Wuhan", "Sunshine Avenue", "430200");

		Add1.displayAddress();
		Add2.displayAddress();

		Add1.updateCountry(Add2.getCountry());
		Add1.updateProvince(Add2.getProvince());
		Add1.updateCity(Add2.getCity());
		Add1.updateStreet(Add2.getStreet());
		Add1.updateZip(Add2.getZip());
		
		Add1.displayAddress();
	}
}
