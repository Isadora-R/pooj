package modulodoisexseis;

import java.util.Scanner;

public class ModuloDoisExSeis {

	public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Digite a massa inicial (g): ");
        double massaInicial = cin.nextDouble();
        double massa = massaInicial;
        double massaFinal = 0.5;
        int tempoSegundos = 0;

        
        while (massa >= massaFinal) {
            massa /= 2;
            tempoSegundos += 50;
        }

        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600) / 60;
        int segundos = tempoSegundos % 60;

        System.out.println("\nMassa inicial: " + massaInicial + " g");
        System.out.println("Massa final: " + massa + " g");
        System.out.println("Tempo necessário: " + horas + " h " + minutos + " min " + segundos + " s");

        cin.close();
    }

}
