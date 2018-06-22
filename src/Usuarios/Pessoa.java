package src.Usuarios;

public class Pessoa {
	private String Nome;
	private String CPF;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return Nome;
	}
//fvtgkkjfhdgfhhjk
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
