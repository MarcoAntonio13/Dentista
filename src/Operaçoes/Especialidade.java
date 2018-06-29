package src.Operaçoes;

public class Especialidade {
	private String Nome;
	private double Valor;
	
	public Especialidade() {
		
	}
	
	public Especialidade(String nome, double valor) {
		
		Nome = nome;
		Valor = valor;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public double getValor() {
		return Valor;
	}
	
	public void setValor(double valor) {
		Valor = valor;
	}
	
}
