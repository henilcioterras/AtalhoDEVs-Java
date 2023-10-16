package st.atalhodevs.logica;

public class Recursividade_Fatorial {

	public static void main(String[] args) {
		System.out.println(calcularFatorial(5));

	}
	public static int calcularFatorial(int numero) {
		if(numero == 0) {
			return 1;
		}else {
			return numero * calcularFatorial(numero - 1);
			
		}
	}

}
