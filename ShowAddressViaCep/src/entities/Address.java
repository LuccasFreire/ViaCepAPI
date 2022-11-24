package entities;

public class Address {
	
	private String logradouro;
	private String bairro;
	private String localidade;
	private String uf;
	
	
	

	public String getStreet() {
		return logradouro;
	}
	
	public String getNbhd() {
		return bairro;
	}
	
	public String getCity() {
		return localidade;
	}
	
	public String getUf() {
		return uf;
	}
	@Override
	public String toString() {
		return "Street = " + logradouro + "\nNeighbourhood = " + bairro + "\nCity = " + localidade + "\nUF = "  +  uf;
	}
	
}
