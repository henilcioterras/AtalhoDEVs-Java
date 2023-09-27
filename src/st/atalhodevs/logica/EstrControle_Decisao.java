package st.atalhodevs.logica;

public class EstrControle_Decisao {

	public static void main(String[] args) {
		int idade = 18;//variavel utilizada, altera para 21 para o exemplo 3
		
		//exemplo 1
		if(idade >= 18) {
			System.out.println("Você é maior de idade.");
		}
		
		//exemplo 2
		if(idade >= 18) {
			System.out.println("Você é maior de idade.");
		}else {
			System.out.println("Você é menor de idade");
		}
			
		//exemplo 3
		if(idade < 18) {
			System.out.println("Você é menor de idade.");
		}else if(idade == 18){
			System.out.println("Você acabou de atingir a maioridade.");
		}else {
			System.out.println("Você é maior de idade.");
		}
		
	}
}
