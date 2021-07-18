package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
	
	
	public String numCartao;
	private List<Endereco> enderecos;
	
	public void adicionaEndereco(Endereco endereco) {
		if(endereco == null) {
			throw new NullPointerException("Endereco n�o pode ser nulo");
		}
		if(endereco.cep == null) {
			throw new NullPointerException("Cep n�o pode ser nulo");
		}
		
		getEnderecos();
	}

	private List<Endereco> getEnderecos() {
		if(enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}

}
