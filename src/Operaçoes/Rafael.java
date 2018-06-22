
package src.Operaçoes;
import src.Usuarios.*;
import src.Operaçoes.*;

public class Rafael {
	
	
	private Dentista dentistas[];
	private int indiceDentistas=0;
	
	public void listarDentista() {
		for(int p = 0;  p < indiceDentistas; p++) {
			if(dentistas[p] != null) {
				System.out.println(p + " " + dentistas[p]);
			}
		}
	}
	public static void main(String[] arg) {
		Rafael metodos2 = new Rafael();
		metodos2.listarDentista();
	}
	private Fatura faturas[];
	private int indiceFaturas=0;
	
	public void listarFatura() {
		for(int v = 0;  v < indiceFaturas; v++) {
			if(faturas[v] != null) {
				System.out.println(v + " " + faturas[v]);
				
				
			}
			
		}
	}
}