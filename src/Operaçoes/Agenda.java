

import Usuarios.*;
import java.util.Scanner;

public class Agenda {

	
	private Cliente Cliente;
	private Dentista Dentista;
	private String Data;
	private Especialidade Especialidade;
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	public Dentista getDentista() {
		return Dentista;
	}
	public void setDentista(Dentista dentista) {
		Dentista = dentista;
	}
	
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	
	public Especialidade getEspecialidade() {
		return Especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		Especialidade = especialidade;
	}
	
	public void Agendar(Cliente cliente, Dentista dentista) {
		Scanner sc = new Scanner(System.in);
		int escolha_especialidade;
		Especialidade spcs[] = {new Especialidade("Consulta", 400.00), new Especialidade("Canal", 600.00),new Especialidade("Limpeza", 450.00)};
		System.out.println("1 - consulta \n 2 - canal \n 3 - limpeza ");
		System.out.println("Digite o nuemro correspondente a especialidade dentaria");
		escolha_especialidade = sc.nextInt();
		this.Especialidade = spcs[escolha_especialidade-1];
		System.out.println("Digite qual dia será agendado");
		sc.next();
		this.Data = sc.nextLine();
		this.Cliente = cliente;
		this.Dentista = dentista;
	}
	public static void main(String[]args) {
		Cliente cl = new Cliente();
		Dentista dn = new Dentista();
		Agenda ag = new Agenda();
		
		ag.Agendar(cl, dn);
	}
}
