package estruturaCondicional;

import java.util.Scanner;

public class desafioDevVida {

	public static void main(String[] args) {

		

		Scanner ler = new Scanner (System.in);

		double nota1,nota2,nota3,nota4,media;

		System.out.print("informe a primeira nota: ");

		nota1 = ler.nextInt();

		System.out.print("informe a segunda nota: ");

		nota2 = ler.nextInt();

		System.out.print("informe a terceira nota: ");

		nota3 = ler.nextInt();

		System.out.print("informe a quarta nota: ");

		nota4 = ler.nextInt();

		media = (nota1+nota2+nota3+nota4)/4;

		System.out.println(" A media do aluno é: " + media);

		if (media > 6) {

		System.out.println ("O aluno está aprovado");

		}

		else if (media < 4) {

		System.out.println("O aluno está de reprovado");

		}

		else{

		System.out.println (" O aluno está reprovado");

		}

		ler.close();

		}

		}