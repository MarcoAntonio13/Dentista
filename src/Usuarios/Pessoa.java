package src.Usuarios;

public class Pessoa {
	private String Nome;
	private String CPF;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Pessoa(String nome, String cpf) {
		Nome = nome;
		CPF = cpf;
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
	
	public void editar(String Nome , String CPF) {
		this.Nome = Nome;
		this.CPF = CPF;
	}
	
	
}
