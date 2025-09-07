package modulodoisexdois;

import java.util.Scanner;

public class ModuloDoisExNove {

	public static void cadastrarProduto(String[] nomes, int[] quantidades, int indice) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Digite o nome do produto: ");
		nomes[indice] = cin.nextLine();
		System.out.print("Digite a quantidade inicial em estoque: ");
		quantidades[indice] = cin.nextInt();
		cin.nextLine();
		System.out.println("Produto cadastrado com sucesso!\n");
	}

	public static void consultarProduto(String[] nomes, int[] quantidades) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Digite o nome do produto para consulta: ");
		String nome = cin.nextLine();
		boolean encontrado = false;
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i] != null && nomes[i].equalsIgnoreCase(nome)) {
				System.out.println("Produto: " + nomes[i] + " | Quantidade em estoque: " + quantidades[i]);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Produto não encontrado.");
		}
		System.out.println();
	}

	public static void atualizarEstoque(String[] nomes, int[] quantidades) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Digite o nome do produto para atualização: ");
		String nome = cin.nextLine();
		boolean encontrado = false;
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i] != null && nomes[i].equalsIgnoreCase(nome)) {
				System.out.print("Digite a quantidade a adicionar (- diminuir): ");
				int quant = cin.nextInt();
				cin.nextLine();
				quantidades[i] += quant;
				System.out.println("Estoque atualizado! Nova quantidade: " + quantidades[i] + "\n");
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Produto não encontrado.\n");
		}
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String[] nomes = new String[100];
		int[] quantidades = new int[100];
		int totalProdutos = 0;
		int opcao;

		do {
			System.out.println("----- Sistema de Estoque -----");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Consultar produto");
			System.out.println("3 - Atualizar estoque");
			System.out.println("0 - Sair");
			System.out.println("------------------------------");
			System.out.print("Escolha uma opção: ");
			opcao = cin.nextInt();
			cin.nextLine();

			switch (opcao) {
			case 1:
				if (totalProdutos < nomes.length) {
					cadastrarProduto(nomes, quantidades, totalProdutos);
					totalProdutos++;
				} else {
					System.out.println("Capacidade máxima de produtos atingida.\n");
				}
				break;
			case 2:
				consultarProduto(nomes, quantidades);
				break;
			case 3:
				atualizarEstoque(nomes, quantidades);
				break;
			case 0:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Opção inválida!\n");
			}
		} while (opcao != 0);
	}
}
