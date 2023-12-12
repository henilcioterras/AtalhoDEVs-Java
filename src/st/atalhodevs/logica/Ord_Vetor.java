package st.atalhodevs.logica;

public class Ord_Vetor {

	static int vet[]= {2,6,3,1,5,4,8,7,9};
	public static void main(String[] args) {
		ordenar(vet);
		mostrar(vet);

	}
	static void ordenar(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			for (int j = i+1; j < vet.length; j++) {
				if(vet[j]<vet[i]) {
					int aux=vet[i];
					vet[i]=vet[j];
					vet[j]=aux;
				}
			}
		}
	}
	static void mostrar(int []vet) {
		for (int i : vet) {
			System.out.print(i+" ");
		}
	}

}
