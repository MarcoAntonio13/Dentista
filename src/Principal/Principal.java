package Principal;
import Usuarios.*;
import Opera�oes.*;

import java.util.Scanner;

public class Principal {
		
	
	public static void Login() {
		
		Cliente cliente = new Cliente();
		Dentista dentista = new Dentista();
		Agenda agenda = new Agenda();
		Fatura fatura;
		String User;
		String Pass;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu usuario");
		User = sc.nextLine();
		System.out.println("Digete sua senha");
		Pass = sc.nextLine();
		
		if(User.equals("admin") && Pass.equals("123")) {
			System.out.println("Bem vindo");
			int op = 4;
			while(op != 0) {
				System.out.println("1 - Cadastrar Cliente");
				System.out.println("2 - Cadastrar Dentista");
				System.out.println("3 - Agendar Consulta");
				System.out.println("0 - Sair");
				op = sc.nextInt();
				switch(op) {
					case 1:{						
						cliente.Cadastrar_Cliente();
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
						System.out.println("Numero digitado � inv�lido");
				}
			}
			
		}else {
			System.out.println("Senha ou usu�rio incorretos....");
			System.exit(0);
		}
		sc.close();
	}
	
	public static void main (String []args) {
		Principal.Login();
	}
}