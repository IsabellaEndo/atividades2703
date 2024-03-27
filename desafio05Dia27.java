package estruturaCondicional;

import java.util.Scanner;

public class desafio05Dia27 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int senhacorreta, cpfcorreto, saldo ;
		String usuariocorreto;

		usuariocorreto = "usuario123";
		cpfcorreto = 1234567890; 
		senhacorreta = 1234; 
		saldo = 10000; 
		



		System.out.print("Digite o usuario: ");
		String usuario = ler.nextLine();
		System.out.print("Digite o cpf: ");
		String cpf = ler.nextLine();
		System.out.print("Digite a senha: ");
		String senha = ler.nextLine();
		
		if (cpf.equals(cpfcorreto) && senha.equals(senhacorreta)) {

			System.out.print("Digite o valor que deseja sacar: ");
			double valorSaque = ler.nextDouble();


			if (saldo >= valorSaque) {
				saldo -= valorSaque;
				System.out.println("Saque de " + valorSaque + " realizado: ");
				System.out.println("Novo saldo: " + saldo);
			} else {
				System.out.println("seu saldo esta insuficiente ");
			}
		} else {
			System.out.println("CPF ou senha errados.tente novamente");
		}
		ler.close();
	}
}