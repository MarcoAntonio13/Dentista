package src.Operaçoes;
import src.Usuarios.*;

import java.util.Scanner;

import src.Operaçoes.*;

public class Metodos {

	private Especialidade especialidades[];
	private int indiceExpecialidades;
	
	public void agendar() {
		Scanner sc = new Scanner(System.in);
		int opcao;
		Agendamento agendamento;
		Cliente cliente;
		Dentista dentista;
		String data;
		Especialidade especialidade;
		System.out.println("Escolha o cliente: ");
		listarCliente();
		opcao = sc.nextInt();
		cliente = clientes[opcao];
		System.out.println("Escolha o dentista: ");
		listarDentista();
		opcao = sc.nextInt();
		dentista = dentistas[opcao];
		System.out.println("Escolha a especialidade do dentista: ");
		listarEspecialidades();
		opcao = sc.nextInt();
		sc.next();
		especialidade = especialidades[opcao];
		System.out.println("Digite o dia da consulta: ");
		data = sc.nextLine();
		agendamento = new Agendamento(cliente, dentista, data, especialidade);
		gerarFatura(agendamento);
		
	}
	public static void main(String[] arg) {
		
	}
}
