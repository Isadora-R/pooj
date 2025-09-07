package calculoIMC;

import java.util.Scanner;

public class CalculoIMC {
	/*
	 * Nomes, idades, pesos, e alturas dos atletas
	 * 
	 * 
	 * Abaixo do peso: IMC < 18,5
	 * Peso normal: 18,5 <= IMC < 24,9
	 * Sobrepeso: 25 <= IMC < 29,9
	 * Obesidade: IMC >= 30 
	 */

	public static void calcularIMC(double imc[], double altura[], double peso[]) {
		for (int i = 0; i < peso.length; i++) {
			imc[i] = peso[i]/(altura[i]*altura[i]);			
		}
	}
	
	public static void calcularCategoria(double imc[], String categoria[]) {
		for (int i = 0; i < imc.length; i++) {
			
			if(imc[i] < 18.5)
				categoria[i] = "Abaixo do peso";
			else if(imc[i] < 25)
				categoria[i] = "Peso normal";
			else if(imc[i] < 30) 
				categoria[i] = "Sobrepeso";
			else
				categoria[i] = "Obeso";
		}
	}

	public static void main(String[] args) {

		System.out.println("Qual é o número de atletas?");
		Scanner entrada = new Scanner(System.in);
		int quantidadeAtletas = entrada.nextInt();
		System.out.println("Quantidade informada: " + quantidadeAtletas);

		String nomes[] = new String[quantidadeAtletas];
		double[] pesos = new double[quantidadeAtletas];
		double[] alturas = new double[quantidadeAtletas];
		double[] imc = new double[quantidadeAtletas];
		String classificacao[] = new String[quantidadeAtletas];

		for (int i = 0; i < quantidadeAtletas; i++) {
			System.out.println("Informe o nome do atleta: " + (i + 1));
			nomes[i] = entrada.next();
			
			System.out.println("Informe o peso (kg) do atleta: " + (i + 1));
			pesos[i] = entrada.nextDouble();
			
			System.out.println("Informe a altura (m) do atleta: " + (i + 1));
			alturas[i] = entrada.nextDouble();
		}
		
		calcularIMC(imc,alturas,pesos);
		calcularCategoria(imc,classificacao);
		for (int i = 0; i < imc.length; i++) {
			System.out.println("IMC do atleta " + nomes[i] + ": " + imc[i] + " "
					+ "Categoria: " + classificacao[i]);
		}
	}

}
