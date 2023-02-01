package com.david;

import java.util.Scanner;

public class ForaLuz {
	boolean[][] tablero;
	Scanner scanner;

	public ForaLuz() {
		scanner = new Scanner(System.in);
		mostrarMenu();
	}

	public void rellenar() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0 ; j < tablero.length; j++) {
				if (Math.random() > 0.5) {
					tablero[i][j] = true;
				} else {
					tablero[i][j] = false;
				}
			}
		}
	}
	
	public static void mostrarAscii() {
		String line = "\r\n"
				+ " __                                                      ________                           \r\n"
				+ "/  |                                                    /        |                          \r\n"
				+ "$$ |       __    __   _______   ______    _______       $$$$$$$$/______    ______   ______  \r\n"
				+ "$$ |      /  |  /  | /       | /      \\  /       |      $$ |__  /      \\  /      \\ /      \\ \r\n"
				+ "$$ |      $$ |  $$ |/$$$$$$$/ /$$$$$$  |/$$$$$$$/       $$    |/$$$$$$  |/$$$$$$  |$$$$$$  |\r\n"
				+ "$$ |      $$ |  $$ |$$ |      $$    $$ |$$      \\       $$$$$/ $$ |  $$ |$$ |  $$/ /    $$ |\r\n"
				+ "$$ |_____ $$ \\__$$ |$$ \\_____ $$$$$$$$/  $$$$$$  |      $$ |   $$ \\__$$ |$$ |     /$$$$$$$ |\r\n"
				+ "$$       |$$    $$/ $$       |$$       |/     $$/       $$ |   $$    $$/ $$ |     $$    $$ |\r\n"
				+ "$$$$$$$$/  $$$$$$/   $$$$$$$/  $$$$$$$/ $$$$$$$/        $$/     $$$$$$/  $$/       $$$$$$$/ \r\n"
				+ "                                                                                            \r\n"
				+ "                                                                                            \r\n"
				+ "                                                                                            \r\n";
		
		System.out.println(line);
		                                                                                           
	}

	public void mostrarMenu() {
		System.out.println("FORA LUZ");
		System.out.println("CREADO POR QUIQUE, OSCAR, LUIS, FERNANDO, DAVID");
		System.out.println("1 - Empezar juego");
		System.out.println("2 - Salir del juego");
		System.out.println();
		System.out.print("OPCIÓN: ");
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

	public void mostrarTablero() {
		System.out.print("\n    ");
		for (int x = 0; x < tablero.length; x++) {
			System.out.print(x + "  ");
		}
		
		System.out.println("\n");
		
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++) {
				if (y == 0) System.out.print(x + "   ");
				System.out.print((tablero[x][y] ? "⚪" : "⚫") + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void empezarJuego() {
		System.out.print("De cuanto quieres que sea el tablero: ");
		int c = scanner.nextInt();
		tablero = new boolean[c][c];
		rellenar();
		mostrarTablero();
		solicitarCoordenadas();
	}

	public void salirJuego() {
		System.out.println("Has salido del juego");
		System.exit(0);
	}

	public boolean esGanador() { // Comproba se o array de booleanos é todo falso e polo tanto gana o xogo
		boolean esGanador = true;
		for (boolean[] columna : tablero) {
			for (boolean fila : columna) {
				if (fila == true) {
					esGanador = false;
					break;
				}
			}
			if (esGanador)
				break;
		}
		return esGanador;
	}

	public void solicitarCoordenadas() {
		System.out.print("Ingresa las coodenadas en X: ");
		int x = scanner.nextInt();

		System.out.print("Ingresa las coodenadas en Y: ");
		int y = scanner.nextInt();
		
		comprobarCoordenadas(x, y);
	}

	public void comprobarCoordenadas(int x, int y) {
			if (x >= tablero.length || x < 0 || y >= tablero[0].length || y < 0) {
				System.out.println("Las coordenadas son incorrectas");
				mostrarTablero();
				solicitarCoordenadas();
			} else {
				tablero[x][y] = !tablero[x][y];
				
				if (x + 1 < tablero.length) {
					tablero[x+1][y] = !tablero[x+1][y];
				}
				
				if (x - 1 >= 0) {
					tablero[x-1][y] = !tablero[x-1][y];
				}
				
				if (y + 1 < tablero[0].length) {
					tablero[x][y+1] = !tablero[x][y+1];
				}
				
				if (y - 1 >= 0) {
					tablero[x][y-1] = !tablero[x][y-1];
				}
				
				if (esGanador()) {
					System.out.println("ERES GANADOR");
					mostrarTablero();
					salirJuego();
					return;
				}
				
				mostrarTablero();
				solicitarCoordenadas();
			}
	}

}
