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

	public void rellenar(){

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (Math.random() > 0.5) {
					tablero[i][j] = true;
				} else {
					tablero[i][j] = false;
				}
			}
		}
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
	
	public void mostrarTablero() {
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++) {
				System.out.print((tablero[x][y] ? "1" : "0") + " ");
			}
			System.out.println();
		}
	}

	public void empezarJuego() {

	}

	public void salirJuego() {
		System.exit(0);
	}
	public void ganador(){ //Comproba se o array de booleanos é todo falso e polo tanto gana o xogo 
		boolean esTrue = false;
			for (boolean[] columna : tablero){
				for (boolean fila : columna){
					if (fila == true) {
						esTrue = true;
						break;
					}
				}
				if (esTrue) break;
		}
		if (!esTrue) {
			System.out.println("HAS GANADO");
			salirJuego();
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
