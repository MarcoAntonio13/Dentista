package src.Opera�oes;
import src.Usuarios.*;
import src.Opera�oes.*;

import java.util.Scanner;

public class Principal {
	
	private static final String LOGIN = "admin";
	private static final String SENHA = "123456";
	private Dentista dentistas[];
	private Cliente clientes[];
	private Especialidade especialidades[];
	private Fatura faturas[];
	private int indiceClientes=0;
	private int indiceDentista=0;
	private int indiceEspecialidades=0;
	
	public Principal() {
		// TODO Auto-generated constructor stub
		dentistas = new Dentista[100];
		clientes = new Cliente[100];
		especialidades = new Especialidade[100];
		faturas = new Fatura[100];
	}
	
	public void Login() {
		String User;
		String Pass;
		Scanner sc = new Scanner(System.in);
		System.out.println("Consult�rio Odontol�gico\n");
		System.out.println("Digite seu Usuario");
		User = sc.nextLine();
		System.out.println("Digite sua Senha");
		Pass = sc.nextLine();
		
		if(User.equals(LOGIN) && Pass.equals(SENHA)) {
			System.out.println("Bem Vindo!!!");
		}else {
			System.exit(0);
		}
		/*
		Cliente cliente = new Cliente();
		Dentista dentista = new Dentista();
		Agendamento agenda = new Agendamento();
		Fatura fatura;
		String User;
		String Pass;
		Scanner sc = new Scanner(System.in);
		System.out.println("Consult�rio Odontol�gico\n");
		System.out.println("Digite o seu Usuario");
		User = sc.nextLine();
		System.out.println("Digite a sua Senha");
		Pass = sc.nextLine();
		
		if(User.equals("admin") && Pass.equals("123")) {
			System.out.println("Bem Vindo");
			int op = 4;
			while(op != 0) {
				System.out.println("[1] - Cadastrar Cliente");
				System.out.println("[2] - Cadastrar Dentista");
				System.out.println("[3] - Agendar Consulta");
				System.out.println("[0] - Sair");
				op = sc.nextInt();
				switch(op) {
					case 1:{						
						break;
					}
					case 2:{
						dentista.Cadastrar_Dentista();
						break;
					}
					case 3:{
						agenda.Agendar(cliente, dentista);
						fatura = new Fatura(agenda);
						fatura.Gerar_Fatura();
						break;
					}
					case 0:{
						System.exit(0);
						continue;
					}
					default:
						System.out.println("N�mero Digitado � Inv�lido");
				}
			}
			
		}else {
			System.out.println("Senha ou Usu�rio Inv�lidos....");
			System.exit(0);
		}
		sc.close();
		*/
	}
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int op = 4;
		while(op != 0) {
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Cadastrar Dentista");
			System.out.println("3 - Agendar Consulta");
			System.out.println("0 - Sair");
			op = sc.nextInt();
			switch(op) {
				case 1:{	
					System.out.println("Cadastro de cliente");
					cadastrarCliente();
					break;
				}
				case 2:{
					System.out.println("Cadastro de dentista");
					break;
				}
				case 3:{
					System.out.println("Agendamento de consulta");
					break;
				}
				case 0:{
					System.exit(0);
					continue;
				}
				default:
					System.out.println("Numero digitado � inv�lido");
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
		System.out.println("Digite o endere�o do cliente: ");
		endereco = sc.nextLine();
		sc.next();
		clientes[indiceClientes] = new Cliente(nome, cpf, endereco);
		indiceClientes++;
	}
	
	public void gerarFatura(Agendamento agendamento) {
		Scanner scanner = new Scanner(System.in);
		
	}
	
	public void agendar() {
		Scanner sc = new Scanner(System.in);
		
	}
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.Login();
		principal.menu();
	}
	
}