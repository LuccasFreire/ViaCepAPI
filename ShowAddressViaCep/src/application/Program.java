package application;

import java.util.Scanner;

import entities.Address;
import entities.CepService;

public class Program {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Insert the cep of your street: ");
		String cep = kb.nextLine();
		
		Address address = CepService.buscaEnderecoPelo(cep);
		
		System.out.println(address.toString());

		
		kb.close();
	}

}
