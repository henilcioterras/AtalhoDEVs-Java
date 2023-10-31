package st.atalhodevs.logica;

public class Recursividade_Fibonaci {

	public static void main(String[] args) {
		int posicao = 2;
		
		System.out.println(fibonaci(posicao));

	}
	public static int fibonaci(int pos) {
		if(pos <= 1) {
			return pos;
		}
		else {
			return fibonaci(pos - 1) + fibonaci(pos - 2);
		}
	}

}
