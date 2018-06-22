package src.Operaçoes;
public class Fatura {

	private Agendamento Agenda;
	private double Valor;
	public Fatura(Agendamento agenda, double valor) {
		Agenda = agenda;
		Valor=valor;

	}



	public Agendamento getAgenda() {
		return Agenda;
	}



	public void setAgenda(Agendamento agenda) {
		Agenda = agenda;
	}



	public double getValor() {
		return Valor;
	}



	public void setValor(double valor) {
		Valor = valor;
	}



	public void Gerar_Fatura() {
		if(Agenda.getEspecialidade().getValor() > 500.00)
			this.Valor = Agenda.getEspecialidade().getValor()*0.9;
		else
			this.Valor = Agenda.getEspecialidade().getValor();
		
		System.out.println("___Fatura___"
				+ "\nCliente: "
				+ "\n>Nome:"+this.Agenda.getCliente().getNome()
				+"\n>CPF:"+this.Agenda.getCliente().getCPF()
				+"\n>Endereço:"+this.Agenda.getCliente().getEndereco()
				+"\n\nValor:"+this.Agenda.getEspecialidade().getValor()
				+"\nTotal com desconto:"+this.Valor);
	}
}
