package estruturaCondicional;

import java.util.Scanner;

public class desafio03Dia27 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("digite um numero:");
		numero = ler.nextInt();

		if(numero % 2 == 0) {
			System.out.println(numero + "o numero é par ");
		}		

		else if (numero % 2 == 1){
			System.out.println(numero + "o numero é impar ");

		} 
		else { 
			System.out.println(numero + "o numero é invalido ");
		}
		ler.close();
	}


}

















