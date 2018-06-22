package src.Operaçoes;

import src.Usuarios.*;
import src.Operaçoes.*;

import java.util.Scanner;

public class Principal {

	private static final String LOGIN = "admin";
	private static final String SENHA = "123456";
	private Dentista dentistas[];
	private Cliente clientes[];
	private Especialidade especialidades[];
	private Fatura faturas[];
	private int indiceClientes = 1;
	private int indiceDentistas = 1;
	private int indiceEspecialidades = 1;
	private int indiceFaturas = 1;

	public Principal() {
		// TODO Auto-generated constructor stub
		dentistas = new Dentista[100];
		clientes = new Cliente[100];
		especialidades = new Especialidade[100];
		faturas = new Fatura[100];
	}

	public void listarCliente() {
		for (int i = 0; i < indiceClientes; i++) {
			if (clientes[i] != null) {
				System.out.println(i + " " + clientes[i].getNome());
			}
		}
	}

	public void listarExpecialidades() {
		for (int i = 0; i < indiceEspecialidades; i++) {
			if (especialidades[i] != null) {
				System.out.println(i + " " + especialidades[i].getNome());
			}
		}
	}

	public void Login() {
		String User;
		String Pass;
		Scanner sc = new Scanner(System.in);
		System.out.println("Consultório Odontológico\n");
		System.out.println("Digite seu Usuario");
		User = sc.nextLine();
		System.out.println("Digite sua Senha");
		Pass = sc.nextLine();

		if (User.equals(LOGIN) && Pass.equals(SENHA)) {
			System.out.println("Bem Vindo!!!");
		} else {
			System.exit(0);
		}
		/*
		 * Cliente cliente = new Cliente(); Dentista dentista = new Dentista();
		 * Agendamento agenda = new Agendamento(); Fatura fatura; String User; String
		 * Pass; Scanner sc = new Scanner(System.in);
		 * System.out.println("Consultório Odontológico\n");
		 * System.out.println("Digite o seu Usuario"); User = sc.nextLine();
		 * System.out.println("Digite a sua Senha"); Pass = sc.nextLine();
		 * 
		 * if(User.equals("admin") && Pass.equals("123")) {
		 * System.out.println("Bem Vindo"); int op = 4; while(op != 0) {
		 * System.out.println("[1] - Cadastrar Cliente");
		 * System.out.println("[2] - Cadastrar Dentista");
		 * System.out.println("[3] - Agendar Consulta");
		 * System.out.println("[0] - Sair"); op = sc.nextInt(); switch(op) { case 1:{
		 * break; } case 2:{ dentista.Cadastrar_Dentista(); break; } case 3:{
		 * agenda.Agendar(cliente, dentista); fatura = new Fatura(agenda);
		 * fatura.Gerar_Fatura(); break; } case 0:{ System.exit(0); continue; } default:
		 * System.out.println("Número Digitado é Inválido"); } }
		 * 
		 * }else { System.out.println("Senha ou Usuário Inválidos...."); System.exit(0);
		 * } sc.close();
		 */
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		int op = 4;
		while (op != 0) {
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Cadastrar Dentista");
			System.out.println("3 - Agendar Consulta");
			System.out.println("0 - Sair");
			op = sc.nextInt();
			switch (op) {
			case 1: {
				System.out.println("Cadastro de cliente");
				cadastrarCliente();
				break;
			}
			case 2: {
				System.out.println("Cadastro de dentista");
				break;
			}
			case 3: {
				System.out.println("Agendamento de consulta");
				break;
			}
			case 0: {
				System.exit(0);
				continue;
			}
			default:
				System.out.println("Numero digitado é inválido");
			}
		}
	}

	public void cadastrarCliente() {
		Scanner sc = new Scanner(System.in);
		String nome;
		String cpf;
		String endereco;
		System.out.println("Digite o nome do cliente:");
		nome = sc.nextLine();
		System.out.println("Digite o CPF do cliente: ");
		cpf = sc.nextLine();
		System.out.println("Digite o endereço do cliente: ");
		endereco = sc.nextLine();
		sc.next();
		clientes[indiceClientes] = new Cliente(nome, cpf, endereco);
		indiceClientes++;
	}

	public void cadastrarDentista() {
		Scanner sc = new Scanner(System.in);
		String nome;
		String cpf;
		String especialidade;
		System.out.println("Digite o nome do dentista:");
		nome = sc.nextLine();
		System.out.println("Digite o CPF do dentista: ");
		cpf = sc.nextLine();
		System.out.println("Digite a especialidade do dentista: ");
		especialidade = sc.nextLine();
		sc.next();
		dentistas[indiceDentistas] = new Dentista(nome, cpf, especialidade);
		indiceDentistas++;
	}

	public void gerarFatura(Agendamento agendamento) {
		System.out.println("Fatura:");

		System.out.println("Cliente: " + agendamento.getCliente().getNome());
		System.out.println("Dentista: " + agendamento.getDentista().getNome());
		System.out.println("Data: " + agendamento.getData());
		System.out.println("Valor: " + agendamento.getEspecialidade().getValor());
		if (agendamento.getEspecialidade().getValor() > 500) {
			faturas[indiceFaturas] = new Fatura(agendamento, agendamento.getEspecialidade().getValor() * 0.9);
			indiceFaturas++;
		}//fdsf

		else {
		faturas[indiceFaturas] = new Fatura(agendamento, agendamento.getEspecialidade().getValor() );
			indiceFaturas++;
		}

	}

	public void agendar() {
		Scanner sc = new Scanner(System.in);

	}

	public void listarFatura() {
		for (int v = 0; v < indiceFaturas; v++) {
			if (faturas[v] != null) {
				System.out.println(v + " " + faturas[v].getValor());

			}

		}
	}

	public void listarDentista() {
		for (int p = 0; p < indiceDentistas; p++) {
			if (dentistas[p] != null) {
				System.out.println(p + " " + dentistas[p].getNome());
			}
		}
	}

	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.Login();
		principal.menu();
	}

}