package estruturaCondicional;

import java.util.Scanner;

public class semana {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);

		int numero; 
		
		System.out.println("informe o numero para descobrir o dia da semana");
		numero = ler.nextInt();
		
		if (numero == 1) {
			System.out.println(" o dia da semana é domingo ");
			
		}
			
		else if (numero == 2) {
			System.out.println(" o dia da semana é segunda "); 
			
		}
			
		else if (numero == 3) {
			System.out.println(" o dia da semana é terça "); 
			
		}
			
		else if (numero == 4) {
			System.out.println(" o dia da semana é quarta ");
			
		}
			
		else if (numero == 5) {
			System.out.println("o dia da semana é quinta "); 
			
		}
			
		else if (numero == 6) {
			System.out.println("o dia da semana é sexta "); 
			
		}
			
		else if (numero == 7) {
			System.out.println("o dia da semana é sabado "); 
			
		}
		
		else {
				System.out.println ("valor invalido");
		}

		ler.close();

		

		

 
		

	}



				
			
				
				
			
				
		
			
		
			
		
		
		
		

	}

