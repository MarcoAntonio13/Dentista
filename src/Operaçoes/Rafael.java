
package src.Opera�oes;
import src.Usuarios.*;
import src.Opera�oes.*;

public class Rafael {
	
	
	private Dentista dentistas[];
	private int indiceDentistas=1;
	
	public void listarDentista() {
		for(int p = 0;  p < indiceDentistas; p++) {
			if(dentistas[p] != null) {
				System.out.println(p + " " + dentistas[p].getNome());
			}
		}
	}
	public static void main(String[] arg) {
		Rafael metodos2 = new Rafael();
		metodos2.listarDentista();
	}
	
	//Arrumar Metodo Fatura
	private Fatura faturas[];
	private int indiceFaturas=1;
	
	public void listarFatura() {
		for(int v = 0;  v < indiceFaturas; v++) {
			if(faturas[v] != null) {
				System.out.println(v + " " + faturas[v].getValor());
				
				
			}
			
		}
	}
}