package modulodoisexsete;

import java.util.Scanner;

public class ModuloDoisExSete {
	
	public static int soma(int v[]) {
		int soma = 0;
		for (int i : v) {
			soma += i;
		}
		
		return soma;
	}
	
	public static int produto(int v[]) {
		int produto = 1;
		
		for (int i : v) {
			produto *= i;
		}
		
		return produto;
	}
	
	public static float media(int v[]) {
		return (float) soma(v)/v.length;
	}
	
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
        int[][] vetores = new int[3][];
        for (int i = 0; i < 3; i++) {
            System.out.print("Quantos elementos no " + (i+1) + "º vetor? ");
            int n = cin.nextInt();
            vetores[i] = new int[n];
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o " + (j+1) + "º elemento: ");
                vetores[i][j] = cin.nextInt();
            }
        }

        int[] vetSomas = new int[3];
        int[] vetProdutos = new int[3];
        double[] vetMedias = new double[3];

        for (int i = 0; i < 3; i++) {
            vetSomas[i] = soma(vetores[i]);
            vetProdutos[i] = produto(vetores[i]);
            vetMedias[i] = media(vetores[i]);

            System.out.println("\nVetor " + (i+1) + ":");
            System.out.println("Soma = " + vetSomas[i]);
            System.out.println("Produto = " + vetProdutos[i]);
            System.out.println("Média = " + vetMedias[i]);
        }

        int somaTotal = soma(vetSomas);
        int produtoTotal = 1;
        for (int p : vetProdutos) {
            produtoTotal *= p;
        }
        double mediaTotal = 0;
        for (double m : vetMedias) {
            mediaTotal += m;
        }
        mediaTotal /= vetMedias.length;

        System.out.println("\nSoma do vetor de somas: " + somaTotal);
        System.out.println("Produto do veotr de produtos:  " + produtoTotal);
        System.out.println("Média das médias: " + mediaTotal);
	}

}
