package src.Usuarios;

import java.util.Scanner;

public class Cliente extends Pessoa {
	
	private String Endereco;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	@Override
	public void editar(String Nome, String CPF) {
		// TODO Auto-generated method stub
		super.editar(Nome, CPF);
	}
	
}
