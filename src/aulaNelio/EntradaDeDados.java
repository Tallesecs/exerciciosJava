package aulaNelio;

import java.util.Locale;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		String genero = "masculino";
		int idade = 32;
		double balanco = 10.35784;
		String nome = "Faum";
		
		System.out.printf("%.2f%n", balanco);
		System.out.printf("%.4f%n", balanco);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", balanco);
		System.out.println("--------------------------");
		System.out.printf("%s tem %d de idade, ele é do sexo %s, e tem na conta = %.2f dolares %n", nome, idade, genero, balanco);
		

	}

}
