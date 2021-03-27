package week4_work1;

class Address{
	private String Country;
	private String Province;
	private String City;
	private String Street;
	private String Zip;
	
	public Address(String Country,String Province,
			String City,String Street,String Zip) {
		this.Country = Country;
		this.Province = Province;
		this.City = City;
		this.Street = Street;
		this.Zip = Zip;
	}
	
	public Address() {
		this.Country = "unknown";
		this.Province = "unknown";
		this.City = "unknown";
		this.Street = "unknown";
		this.Zip = "unknown";
	}
	
	public String getCountry() {
		return this.Country; 
	}
	
	public String getProvince() {
		return this.Province;
	}
	
	public String getCity() {
		return this.City;
	}
	
	public String getStreet(){
		return this.Street;
	}
	
	public String getZip() {
		return this.Zip;
	}
	
	public void updateCountry(String Country){
		this.Country = Country;
	}
	
	public void updateProvince(String Province){
		this.Province = Province;
	}
	
	public void updateCity(String City){
		this.City = City;
	}
	
	public void updateStreet(String Street){
		this.Street = Street;
	}
	
	public void updateZip(String Zip) {
		this.Zip = Zip;
	}
	
	public void displayAddress() {
		String msg;
		msg = "Country: " + this.Country +"  ";
		msg += "Province: " + this.Province + "  ";
		msg += "City: " + this.City + "  ";
		msg += "Street: " + this.Street + "  ";
		msg += "Zip: " + this.Zip + " ";
		System.out.println(msg);
	}
}

