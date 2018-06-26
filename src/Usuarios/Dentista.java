package src.Usuarios;

import java.util.Scanner;

public class Dentista extends Pessoa {

	private String CRO;
	
	public Dentista(String nome, String cpf, String cro) {
		super(nome, cpf);
		CRO = cro;
	}
	
	public String getCro() {
		return CRO;
	}
	public void setCro(String cro) {
		CRO = cro;
	}
	
	
}
