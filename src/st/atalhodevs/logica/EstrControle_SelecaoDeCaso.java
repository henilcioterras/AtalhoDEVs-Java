package st.atalhodevs.logica;

public class EstrControle_SelecaoDeCaso {

	public static void main(String[] args) {
		
		String diaSemana="sexta";
				
		switch(diaSemana) {
			case "segunda":
				System.out.println("Hoje é segunda-feira.");
				break;
			case "quarta":
				System.out.println("Hoje é quarta-feira.");
				break;
			default:
				System.out.println("Hoje é um dia qualquer.");
		}
	}
}
