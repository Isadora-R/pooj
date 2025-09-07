package modulodoisexoito;

import java.util.Scanner;

public class ModuloDoisExOito {
	
    public static String vencedor(int[] votos, String[] funcionarios) {
        int maxVotos = votos[0];
        int indice = 0;
        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                indice = i;
            }
        }
        return funcionarios[indice];
    }
    
    public static int votosVencedor(int[] votos) {
        int maxVotos = votos[0];
        for (int v : votos) {
            if (v > maxVotos) {
                maxVotos = v;
            }
        }
        return maxVotos;
    }
    

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
        System.out.print("Quantos funcionários podem ser votados? ");
        int n = cin.nextInt();
        String[] funcionarios = new String[n];
        
        System.out.println("\nLista de funcionários que podem ser votados");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            funcionarios[i] = cin.next();
        }

        int[] votos = new int[n];

        System.out.print("\nQuantos funcionários vão votar? ");
        int nVotos = cin.nextInt();
        
        System.out.println("\n------ELEIÇÃO------");
        for (int i = 0; i < nVotos; i++) {
            System.out.println("\nVoto nº " + (i + 1) + ": escolha o número do funcionário que deseja votar:");
            for (int j = 0; j < n; j++) {
                System.out.println((j + 1) + " - " + funcionarios[j]);
            }

            int voto = cin.nextInt();
            if (voto >= 1 && voto <= n) {
                votos[voto - 1]++;
            } else {
                System.out.println("Voto inválido! Este voto não será contado.");
            }
        }
        
        int maxVotos = 0;
        for (int v : votos) {
            if (v > maxVotos) {
                maxVotos = v;
            }
        }
        
        int contEmpate = 0;
        for (int i = 0; i < n; i++) {
            if (votos[i] == maxVotos) {
                contEmpate++;
            }
        }
        
        if (contEmpate > 1) {
            System.out.println("\nHouve um empate!!");
            for (int i = 0; i < n; i++) {
                if (votos[i] == maxVotos) {
                    System.out.println("Funcionário do mês: " + funcionarios[i]);
                    System.out.println("Total de votos recebidos: " + votos[i]);
                }
            }
        } else {
            String nomeVencedor = vencedor(votos, funcionarios);
            int totalVotos = votosVencedor(votos);
            System.out.println("\nFuncionário do mês: " + nomeVencedor);
            System.out.println("Total de votos recebidos: " + totalVotos);
        }
	}

}
