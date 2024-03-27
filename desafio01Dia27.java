package estruturaCondicional;

import java.util.Scanner;

public class desafio01Dia27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);

		int numero; 
		
		System.out.println("informe o numero para descobrir o mes");
		numero = ler.nextInt();
		
		if (numero == 1) {
			System.out.println(" o mes é janeiro");
			
		}
			
		else if (numero == 2) {
			System.out.println(" o mes é fevereiro"); 
			
		}
			
		else if (numero == 3) {
			System.out.println(" o  mes é março "); 
			
		}
			
		else if (numero == 4) {
			System.out.println(" o mes é abril ");
			
		}
			
		else if (numero == 5) {
			System.out.println("o mes é maio "); 
			
		}
			
		else if (numero == 6) {
			System.out.println("o mes é junho "); 
			
		}
			
		else if (numero == 7) {
			System.out.println("o mes é julho "); 
			
		}
		
		else if (numero == 8) {
			System.out.println("o mes é agosto");
			
		}
		
		else if (numero == 9) {
			System.out.println("o mes é setembro");
		}	
		
		else if (numero == 10) {
			System.out.println("o mes é outubro");
		
		}
		
		else if (numero == 11) {
			System.out.println("o mes é novembro");
			
		}
		
		else if (numero == 12) {
			System.out.println("o mes é dezembro");
			
		}	
	
		
		else {
				System.out.println ("valor mes invalido");
		}

		ler.close();

		

		

 
		

	}


	}


