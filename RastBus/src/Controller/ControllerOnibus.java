package Controller;

import java.util.Scanner;

public class ControllerOnibus {

	String nome;
	double cpf, senha;
	int saldo, recarga = 0;
	Scanner s = new Scanner(System.in);

	public void Mostraronibus() {

		int escolha1;
		System.out.println(
				"Que onibus você quer rastrear?\n1.De blumenau a Gaspar.\n2.De Blumenau a Ilhota.\n3.De Gaspar a Blumenau\n4.De Ilhota a Blumenau.");
		escolha1 = s.nextInt();

		switch (escolha1) {
		case 1:
			System.out.println("Onibus 1 está no bela vista");
			break;
		case 2:
			System.out.println("Onibus 2 está o bairro Poço Grande");
			break;
		case 3:
			System.out.println("Onibus 3 está no ponto final");
			break;
		case 4:
			System.out.println("Onibus 4 ainda não partiu");
			break;
		default:
			break;
		}
	}

	public void mostrarfim() {
		System.out.println("****************************encerrado***************************************");
	}
}
