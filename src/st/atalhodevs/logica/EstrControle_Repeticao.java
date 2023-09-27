package st.atalhodevs.logica;

public class EstrControle_Repeticao {

	public static void main(String[] args) {
		
		//exemplo 1 for
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		//exemplo 2 while 
		int contador = 0; // variavel alternativa para o i
		while(contador < 5) {
			System.out.println(contador);
			contador++;
		}
		
		
		//exemplo 3 do-while
		do {
			System.out.println(contador);
			contador++;
		}while(contador < 5);
		
	}
}
