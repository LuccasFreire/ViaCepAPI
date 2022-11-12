package entities;

public class Address {
	
	private String street;
	private String nbhd;
	private String city;
	private String uf;
	
	
	

	public String getStreet() {
		return street;
	}
	
	public String getNbhd() {
		return nbhd;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getUf() {
		return uf;
	}
	@Override
	public String toString() {
		return "Address [Street = " + street + ", Neighbourhood = " + nbhd + ", City = " + city + ", UF = " + uf + "]";
	}
	
}
