package src.Usuarios;

import java.util.Scanner;

public class Dentista extends Pessoa{

	private int Id_Dentista;
	private String Nome;
	private String CPF;
	private String Especialidade;
	
	public Dentista() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId_Dentista() {
		return Id_Dentista;
	}
	public void setId_Dentista(int id_Dentista) {
		Id_Dentista = id_Dentista;
	}
	public String getEspecialidade() {
		return Especialidade;
	}
	public void setEspecialidade(String especialidade) {
		Especialidade = especialidade;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public void Cadastrar_Dentista() {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o nome do dentista");
		Nome = sc.nextLine();
		System.out.println("digite o CPF do dentista");
		CPF = sc.nextLine();
	}
	
}
