package dia3;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
	
		int x=0,idade,f,m,outro,calm,nerv,agr,n1,n2;
		int calmcont=0,mulhernerv=0,homemagr=0,outrocalm=0,maiornerv=0,menorcalm=0;
		Scanner read = new Scanner(System.in);
		while(x<5) {		//pode ser 150, s� aplicar aqui
			idade=0;
			f=0;
			m=0;
			outro=0;
			calm=0;
			nerv=0;
			agr=0;
			
			System.out.println("\nDigite sua idade: ");
			idade = read.nextInt();
			System.out.println("\nDigite sua orienta��o sexual, 1-Feminino / 2-Masculino / 3-Outros: ");
			n1 = read.nextInt();
			if(n1==1) {
				f++;
			}
			else if(n1==2) {
				m++;
			}
			else if(n1==3) {
				outro++;
			}
			else {
				System.out.println("Entrada inv�lida, por�m prosseguiremos com o c�digo.");
			}
			System.out.println("\nVoc� se considera uma pessoa: 1-Calma / 2-Nervosa / 3-Agressiva: ");
			n2 = read.nextInt();
			if(n2==1) {
				calm++;
			}
			else if(n2==2) {
				nerv++;
			}
			else if(n2==3) {
				agr++;
			}
			else {
				System.out.println("Entrada inv�lida, por�m prosseguiremos com o c�digo.");
			}
			if(calm==1) {
				calmcont++;
			}
			if(f==1 && nerv==1) {
				mulhernerv++;	
			}
			if(m==1 && agr==1){
				homemagr++;
			}
			if(outro==1 && calm==1) {
				outrocalm++;	
			}
			if(idade>40 && nerv==1) {
				maiornerv++;
			}
			if(idade<18 && calm==1) {
				menorcalm++;
			}
				
			
			x++;		
		}
		System.out.printf("\nO n�mero de pessoas calmas � de %d pessoas",calmcont);
		System.out.printf("\nO n�mero de mulheres nervosas � de %d pessoas",mulhernerv);
		System.out.printf("\nO n�mero de homens agressivos � de %d pessoas",homemagr);
		System.out.printf("\nO n�mero de outros calmos � de %d pessoas",outrocalm);
		System.out.printf("\nO n�mero de pessoas com mais de 40 anos e nervosas � de %d pessoas",maiornerv);
		System.out.printf("\nO n�mero de pessoas com menos de 18 anos e calmas � de %d pessoas",menorcalm);
	}
}
