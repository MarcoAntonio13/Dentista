package src.Operaçoes;
public class Fatura {

	private Agenda Agenda;
	private double Valor;
	
	public Fatura(Agenda agenda) {
		Agenda = agenda;

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
