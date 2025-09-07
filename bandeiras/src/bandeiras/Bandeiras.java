package bandeiras;

import java.util.Scanner;

public class Bandeiras {

	public static void desenhaast() {
		System.out.print("* ");
		
	}
	
	public static void desenhai() {
		System.out.print("& ");
	}
	
	public static void desenhaporc() {
		System.out.print("% ");
	}
	
	public static void desenharAlemanha(int n) {
        System.out.println("\nBandeira da Alemanha (" + n + "x" + n + "):");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i < (double) n / 3.0) {
                    desenhaast();
                }
                else if (i < (double) (2 * n) / 3.0) {
                    desenhaporc();
                }
                else {
                    desenhai();
                }
            }
            System.out.println();
        }
    }
	
	public static void desenharBelgica(int n) {
        System.out.println("\nBandeira da Bélgica (" + n + "x" + n + "):");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j < (double) n / 3.0) {
                    desenhaast();
                }
                else if (j < (double) (2 * n) / 3.0) {
                    desenhai();
                }
                else {
                    desenhaporc();
                }
            }
            System.out.println();
        }
    }
	
	
	public static void desenharArgentina(int n) {
        System.out.println("\nBandeira da Argentina (" + n + "x" + n + "):");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i < (double) n / 3.0) {
                    desenhaast();
                }
                else if ((i < (double) (2 * n) / 3.0) && j < (double) n/3.0) {
                    desenhaporc();
                }
                else if ((i < (double) (2 * n) / 3.0) && j >= (double) (2*n)/3.0) {
                    desenhaporc();
                }
                
                else if ((i < (double) (2 * n) / 3.0) && j != (double) n/2.0) {
                    desenhai();
                }
                else {
                    desenhaast();
                }
            }
            System.out.println();
        }
    }
	
	public static void desenharInglaterra(int n) {
	    System.out.println("\nBandeira da Inglaterra (" + n + "x" + n + "):");

	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {

	            boolean barraHorizontal = (i >= (double) n * 0.3 && i < (double) n * 0.6);
	            boolean barraVertical = (j >= (double) n * 0.3 && j < (double) n * 0.6);

	            if (barraHorizontal || barraVertical) {
	                desenhai();
	            } else {
	                desenhaast();
	            }
	        }
	        System.out.println();
	    }
	}
	
	public static void desenharEUA(int n) {
	    System.out.println("\nBandeira dos EUA (" + n + "x" + n + "):");

	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	        	if (i < (double)n/2.5 && j <(double)n/2.5) {
	        		desenhaast();
	        	}
	        	else
	        		desenhai();
	        }
	        System.out.println();
	    }
	}
	
	public static void desenharJapao(int n) {
	    System.out.println("\nBandeira do Japão (" + n + "x" + n + "):");

	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	        	if (i > (double)0.2*n && i <= (double)0.75*n && j > (double)0.2*n && j <= (double)0.75*n) {
	        		desenhai();
	        	}
	        	else
	        		desenhaast();
	        }
	        System.out.println();
	    }
	}
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da bandeira: ");
		
		int n = cin.nextInt();
		
		desenharAlemanha(n);
		desenharBelgica(n);
		desenharArgentina(n);
		desenharInglaterra(n);
		desenharEUA(n);
		desenharJapao(n);
	}

}
