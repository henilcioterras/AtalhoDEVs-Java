package st.atalhodevs.logica;

public class Recursividade_Soma {

	public static void main(String[] args) {
		int max = 1;
		
		System.out.println(soma(max));

	}
	public static int soma(int n) {
		if(n == 1)return n;
		else return n + soma(n - 1);
	}

}
