package dia3;

import java.util.Scanner;

public class doWhileAula {

	public static void main(String[] args) {
		
		int idade;
		Scanner read = new Scanner(System.in);
		System.out.printf("Entre com a sua idade:");
		idade = read.nextInt();
		
		do
		{			
			System.out.printf("\nSua idade: %d",idade);
			if(idade>=18) {
				System.out.printf("\nVocê é maior de idade.");
			}
			else {
				System.out.println("\nVocê é menor de idade.");
			}
			System.out.printf("\nEntre com a sua idade:");
			idade = read.nextInt();
			
		}	while(idade>=1);
	}

}
