package dia3;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		int cont=0,n,soman=0;
		Scanner read = new Scanner(System.in);
		do
		{
			System.out.println("Entre com um número: ");
			n=read.nextInt();
			if(n%3==0) {
				soman+=n;
				cont++;
			}
		}
		
		
		while(n!=0);
		cont-=1;	
		if(cont==0) {
			System.out.println("Você não digitou nenhum número multiplo de 3.");
		}
		else {
		System.out.println("A média dos números multiplos de 3 é:"+soman/cont);
		}
	}

}
