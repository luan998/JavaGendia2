package dia3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		int x,n,impar=0,par=0;
		Scanner read = new Scanner(System.in);
		
		for(x=1;x<=10;x++) {
			System.out.println("Entre com um n�mero: ");
			n = read.nextInt();
			if(n%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.printf("A quantidade de n�meros pares � de: %d, e a quantidade de n�meros impares � de: %d",par,impar);
	}

}
