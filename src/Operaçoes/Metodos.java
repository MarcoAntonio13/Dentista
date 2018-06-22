package src.Operaçoes;
import src.Usuarios.*;
import src.Operaçoes.*;

public class Metodos {

	private Cliente clientes[];
	private int indiceClientes=1;
	
	public void listarCliente() {
		for(int i = 0;  i < indiceClientes; i++) {
			if(clientes[i] != null) {
				System.out.println(i + " " + clientes[i].getNome());
			}
		}
	}
	public static void main(String[] arg) {
		Metodos metodos = new Metodos();
		metodos.listarCliente();
	}
}
