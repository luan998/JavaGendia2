package dia3;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		
		int idade,menor=0,maior=0;
		Scanner read = new Scanner(System.in);
		
		System.out.printf("Entre com a idade:");
		idade = read.nextInt();
		
		while(idade!=-99) {
			if(idade<21) {
				menor++;
			}
			else if(idade>50) {
				maior++;
			}
			System.out.printf("Entre com a idade:");
			idade = read.nextInt();
		}
		System.out.printf("\nO n�mero de pessoas com mais de 21 anos � de %d pessoas, e o n�mero de pessoas com mais de 50 anos � de %d pessoas.",menor,maior);
	}
}
