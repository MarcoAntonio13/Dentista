package src.Usuarios;

import java.util.Scanner;

public class Dentista extends Pessoa {

	private String Especialidade;
	
	public Dentista(String nome, String cpf, String especialidade) {
		super(nome, cpf);
		Especialidade = especialidade;
	}
	
	public String getEspecialidade() {
		return Especialidade;
	}
	public void setEspecialidade(String especialidade) {
		Especialidade = especialidade;
	}
	
	@Override
	public void editar(String Nome, String CPF) {
		super.editar(Nome, CPF);
	}
	
	
}
