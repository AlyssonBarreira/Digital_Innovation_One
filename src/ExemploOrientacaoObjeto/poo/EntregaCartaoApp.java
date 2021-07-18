package poo;

import model.Cliente;
import model.Endereco;

public class EntregaCartaoApp {
	
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		// dados do endereço 
		endereco.cep = "0000000";
		
		Cliente cliente = new Cliente();
		// dados do cliente
	
		try {
			cliente.adicionaEndereco(endereco);
			System.out.println("Cliente adicionado com sucesso");			
		}catch (Exception e){
			System.err.println("Houve um erro ao adicionar o endereço " + e.getMessage());
		}
		
		
	}

}
