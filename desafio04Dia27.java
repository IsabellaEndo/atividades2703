package estruturaCondicional;
import java.util.Scanner;

public class desafio04Dia27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int lado1, lado2, lado3;

		System.out.println("informe a medida do primeiro lado: ");
		lado1= ler.nextInt(); 

		System.out.println("informe a medida do segundo lado: ");
		lado2= ler.nextInt();

		System.out.println("informe a medida do terceiro lado: ");
		lado3= ler.nextInt();

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("O triângulo é equilátero.");
		}
		else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("O triângulo é isósceles.");
		}
		else {
			System.out.println("O triângulo é escaleno.");
		}

		ler.close();
	}
}