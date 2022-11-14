package entities;

public class Address {
	
	private String logradouro;
	private String bairro;
	private String city;
	private String uf;
	
	
	

	public String getStreet() {
		return logradouro;
	}
	
	public String getNbhd() {
		return bairro;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getUf() {
		return uf;
	}
	@Override
	public String toString() {
		return "Address [Street = " + logradouro + ", Neighbourhood = " + bairro + ", City = " + city + ", UF = "  +  uf + "]";
	}
	
}
