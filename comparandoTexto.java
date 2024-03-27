package estruturaCondicional;

import java.util.Scanner;

public class comparandoTexto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// TODO Auto-generated method stub
		String palavra1, palavra2;

		System.out.println("informe a primeira palavra: ");
		palavra1 = ler.nextLine();

		System.out.println("informe a segunda palavra: ");
		palavra2 = ler.nextLine();

		if (palavra1.equals(palavra2)) {
			System.out.println("as palavras sao identicas");
		}
		else {
			System.out.println("as palavras sao diferentes");
		}
		ler.close();




	}

}
