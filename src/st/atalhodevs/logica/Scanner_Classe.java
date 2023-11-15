package st.atalhodevs.logica;

import java.util.Scanner;

public class Scanner_Classe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade=0;
		String nome="";
		
		System.out.println("Idade antes => " + idade);
		System.out.println("Nome antes => " + nome);
		
		System.out.println("Insira a sua idade: ");
		idade=sc.nextInt();
		
		System.out.println("Insira o seu nome: ");
		nome=sc.next();
		
		System.out.println("Idade depois => " + idade);
		System.out.println("Nome depois => " + nome);

	}

}
