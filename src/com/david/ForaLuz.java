package com.david;

import java.util.Scanner;

public class ForaLuz {
	boolean[][] tablero;
	Scanner scanner;

	public ForaLuz(int c) {
		tablero = new boolean[c][c];
		scanner = new Scanner(System.in);
		mostrarMenu();
	}

	public void mostrarMenu() {

		System.out.println("FORA LUZ");
		System.out.println("Longiud del tablero: " + tablero.length);
		System.out.println("CREADO POR QUIQUE, OSCAR, LUIS, FERNANDO, DAVID");
		System.out.println("1 - Empezar juego");
		System.out.println("2 - Salir del juego");
		mostrarTablero(scanner.nextInt());
	}

	public void mostrarTablero(int opcion) {
		switch (opcion) {
			case 1:
				empezarJuego();
				break;

			case 2:
				salirJuego();
				break;
			case 3:
				System.out.println("No es una opción válida");
				System.out.println();
				mostrarMenu();
				break;
		}
	}

	public void empezarJuego() {

	}

	public void salirJuego() {
		System.exit(0);
	}

	public void solicitarCoordenadas() {
		int x = 0;
		int y = 0;
		System.out.println("Ingresa las coodenadas en X.");
		x = scanner.nextInt();

		System.out.println("Ingresa las coodenadas en Y.");
		y = scanner.nextInt();
	}

}
