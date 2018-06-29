package src.Usuarios;

import java.util.Scanner;

public class Cliente extends Pessoa {
	
	private String Endereco;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String nome, String cpf, String endereco) {
		super(nome, cpf);
		Endereco = endereco;
	}
	
	public String getEndereco() {
		return Endereco;
	}
	
	@Override
	public void editar(String endereco) {
		this.Endereco = endereco;
	}
	
}
