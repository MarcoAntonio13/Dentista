package src.Opera�oes;

public class Fatura {
	
	private Agendamento Agenda;
	private double Valor;
	
	//M�todo Construtor devido a Composi��o
	public Fatura(Agendamento agenda, double valor) {
		Agenda = agenda;
		Valor = valor;
		
	}
	
	public Agendamento getAgendamento() {
		return Agenda;
	}
	
	public void setAgendamento(Agendamento agenda) {
		Agenda = agenda;
	}
	
	public double getValor() {
		return Valor;
	}
	
	public void setValor(double valor) {
		Valor = valor;
	}
	
}
