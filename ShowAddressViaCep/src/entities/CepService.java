package entities;
import com.google.gson.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CepService {
	static String webService = "http://viacep.com.br/ws/";
	static int success = 200;
	
	public static Address buscaEnderecoPelo(String cep) throws Exception {
		String apiRequest = webService + cep + "/json";
		try {
			URL url = new URL(apiRequest);
			HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
			
			if (conexao.getResponseCode() != success) 
				throw new RuntimeException("HTTP error code: " + conexao.getResponseCode());
				
				BufferedReader response = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
				String jsonToString = Util.convertJsonToString(response);
				Gson gson = new Gson();
	            Address address = gson.fromJson(jsonToString, Address.class);
	            return address;
			
			
		}
		catch (Exception e){
			throw new Exception("ERRO: " + e);
		}
		
	}
	
}
