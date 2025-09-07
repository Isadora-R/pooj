package modulodoisexquatro;

import java.util.Scanner;

public class ModuloDoisExQuatro {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		System.out.print("Digite o salário mínimo: R$ ");
		double salarioMin = cin.nextDouble();
		System.out.print("Qual o número de dependentes? ");
		int dependentes = cin.nextInt();
		System.out.print("Digite seu salário: R$" );
		double salario = cin.nextDouble();
		System.out.print("Qual a taxa que já foi paga? R$ ");
		double taxa = cin.nextDouble();
		double impostoBruto = 0;
		
		
		if (salario > salarioMin*12) {
			impostoBruto = salario*0.2;
		}
		else if (salario > salarioMin*5) {
			impostoBruto = salario*0.08;
		}
		
		double restituicao = impostoBruto*dependentes*0.02;
		double taxaAdicional = impostoBruto*0.04;
		double impostoRenda = impostoBruto - taxa - restituicao + taxaAdicional;
		
		if(impostoBruto == 0) {
			System.out.println("O funcionário não paga imposto de renda: ");
		}
		else {
			System.out.println("Taxa já paga: R$ " + taxa);
			System.out.println("Imposto Bruto: R$ " + impostoBruto);
			System.out.println("Taxa adicional do governo: R$ " + taxaAdicional);
			System.out.println("Restituição: R$ " + restituicao);
			System.out.println("Imposto de renda total: R$ " + impostoRenda);
		}
		
	}

}
