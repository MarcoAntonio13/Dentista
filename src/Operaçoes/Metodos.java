package src.Operaçoes;
import src.Usuarios.*;

import java.util.Scanner;

import src.Operaçoes.*;

public class Metodos {

	private Especialidade especialidades[];
	private int indiceExpecialidades;
	
	public void listarCliente() {
		for(int i = 0;  i < indiceExpecialidades; i++) {
			if(especialidades[i] != null) {
				System.out.println(i + " " + especialidades[i].getNome());
			}
		}
	}
	public static void main(String[] arg) {
		
	}
}
