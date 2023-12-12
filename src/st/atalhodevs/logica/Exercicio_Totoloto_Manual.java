package st.atalhodevs.logica;

import java.util.Scanner;

public class Exercicio_Totoloto_Manual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 7, n2 = 17, n3 = 12, n4 = 1, n5 = 8, n6 = 25;

		int acertos = 0;

		int nE1 = -1, nE2 = -1, nE3 = -1, nE4 = -1, nE5 = -1, nE6 = -1;

		System.out.println("*****Jogo de Totoloto Manual*****\n--------------------");
		System.out.println("Insira 6 números a apostar=> ");
		for (int i = 0; i < 6; i++) {
			System.out.println("Insira o número " + (i + 1));
			int numEscolhido = sc.nextInt();

			if((i + 1) == 1) nE1=numEscolhido;
			
			if ((i + 1) == 2) { 
				while (numEscolhido == nE1) {
					System.out.println("Insira o número " + (i + 1));
					numEscolhido = sc.nextInt();
				}
				nE2=numEscolhido;
			}
			
			if((i+1)==3) {
				while (numEscolhido == nE1 || numEscolhido == nE2) {
					System.out.println("Insira o número " + (i + 1));
					numEscolhido = sc.nextInt();
				}
				nE3=numEscolhido;
			}
			if((i+1)==4) {
				while (numEscolhido == nE1 || numEscolhido == nE2|| numEscolhido == nE3) {
					System.out.println("Insira o número " + (i + 1));
					numEscolhido = sc.nextInt();
				}
				nE4=numEscolhido;
			}
			if((i+1)==5) {
				while (numEscolhido == nE1 || numEscolhido == nE2|| numEscolhido == nE3
						|| numEscolhido == nE4) {
					System.out.println("Insira o número " + (i + 1));
					numEscolhido = sc.nextInt();
				}
				nE5=numEscolhido;
			}
			if((i+1)==6) {
				while (numEscolhido == nE1 || numEscolhido == nE2|| numEscolhido == nE3
						|| numEscolhido == nE4|| numEscolhido == nE5) {
					System.out.println("Insira o número " + (i + 1));
					numEscolhido = sc.nextInt();
				}
				nE6=numEscolhido;
			}

		}

		System.out.println("Você acertou " + acertos + " números!");

	}

}
