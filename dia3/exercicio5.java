package dia3;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		
		
		int n,soma=0;
		Scanner read = new Scanner(System.in);
		do
		{
			System.out.println("Digite um número inteiro: ");
			n=read.nextInt();
			soma +=n;
			
		}
		
		while(n!=0);
		System.out.println("A soma dos números é: "+soma);
	}
}
