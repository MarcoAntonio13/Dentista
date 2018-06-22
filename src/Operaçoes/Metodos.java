package src.Operaçoes;
import src.Usuarios.*;
import src.Operaçoes.*;

public class Metodos {

	private Cliente clientes[];
	private int indiceClientes=0;
	
	public void listarCliente() {
		for(int i = 0;  i < indiceClientes; i++) {
			if(clientes[i] != null) {
				System.out.println(i + " " + clientes[i]);
			}
		}
	}
	public static void main(String[] arg) {
		Metodos metodos = new Metodos();
		metodos.listarCliente();
	}
}
