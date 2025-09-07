package modulodoisexcinco;

import java.util.Scanner;

public class ModuloDoisExCinco {

	public static boolean vogal(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		System.out.print("Digite quantos nomes serão analisados: ");
		int n = cin.nextInt();

		String[] nomes = new String[n];

		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o " + (i+1) + "º nome: ");
			nomes[i] = cin.next();
		}

		for (String nome : nomes) {
			System.out.println("\nNome: " + nome);

			System.out.print("\nVogais: ");
			for (int i = 0; i < nome.length(); i++) {
				char c = nome.charAt(i);
				if (vogal(c)) {
					System.out.print(c + " ");
				}
			}

			System.out.println("\nConsoantes: ");
			for (int i = 0; i < nome.length(); i++) {
				char c = nome.charAt(i);
				if (!vogal(c) && Character.isLetter(c)) {
					System.out.print(c + " ");
				}
			}
		}
	}
}
