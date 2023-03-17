package Controller;

import java.awt.Menu;
import java.util.Scanner;

public class Rastreio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ControllerOnibus m = new ControllerOnibus();
		int leitura = 0;

		System.out.println("Rasatreio ");

		System.out.println("Bem vindo\n");
		System.out.println(" n1 Rastrear onibus");
		System.out.println(" n2 Encerrar");
		leitura = s.nextInt();

		while (leitura != 2) {

			switch (leitura) {
			case 1:
				m.Mostraronibus();
				break;

			case 2:
				m.mostrarfim();
				break;
			default:
				break;
			}

			System.out.println("1. Rastrear onibus");
			System.out.println("2. Encerrar");
			leitura = s.nextInt();
		}
	}

}
