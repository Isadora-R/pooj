package modulodoisextres;

import java.util.Scanner;

//palindromos: reviver, ana, luzazul

public class ModuloDoisExTres {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String palavra = cin.next();
		boolean palindromo = true;
		
		char[] teste = new char[palavra.length()];
		
		for (int i = 0; i < palavra.length(); i++) {
			teste[i] = palavra.charAt(i);			
		}
		for (int i = 0; i < palavra.length()/2; i++) {
			if(teste[i] != palavra.charAt(palavra.length()-i-1))
				palindromo = false;
			break;
		}
	
	
	if (palindromo)
		System.out.println("A palavra é um palíndromo!");
	else {
		System.out.print("A palavra não é um palíndromo! Palavra inversa: ");
		for (int i = palavra.length()-1; i >=  0; i--) {
			System.out.print(teste[i]);
		}	
	}
	}

}
