package modulodoisexdois;

public class ModulosDoisExDois {
	public static int soma(int v[]) {
		int soma = 0;
		for (int i = 0; i < v.length; i++) {
			soma += v[i];
		}
		return soma;
	}
	
	public static void maiormenor(int v[]) {
		int maior = v[0];
		int menor = v[0];
		
		for (int i = 1; i < v.length; i++) {
			if (maior < v[i]){
				maior = v[i];
			}
			if (menor > v[i]) {
				menor = v[i];
			}	
		}
		System.out.println("O maior número: " + maior);
		System.out.println("O menor número: " + menor);
	}
	
	
	public static float media(int v[]) {
		float sum = 0;
	
		sum = soma(v);
		return sum/v.length;
	}
	
	public static int mediana(int v[]) {
		if (v.length%2 == 0)
			return (v[v.length/2] + v[1+v.length/2])/2;
		else
			return v[v.length/2];
	}
	
	public static void moda(int v[]) {
		int moda = v[0];
		int max = 0;
		
		for (int i = 0; i < v.length; i++) {
			int cont = 0;
			for (int j = 0; j < v.length; j++) {
				if(v[j] == v[i])
					cont++;
			}
			if (cont > max) {
				max = cont;
				moda = v[i];
			}
		}
		System.out.println("Moda: " + moda);
		
	}
	
	public static void main(String[] args) {
		int[] vetor = {1, 2, 3, 3, 3, 4, 4, 5};
		
		System.out.println("Soma dos elementos do vetor: " + soma(vetor));
		maiormenor(vetor);
		System.out.println("Média dos elementos do vetor: " + media(vetor));
		System.out.println("Mediana dos elementos do vetor: " + mediana(vetor));
		moda(vetor);
		
		
	}
}
