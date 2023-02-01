package com.david;

public class ForaLuz {
	boolean[][] tablero;
	
	public ForaLuz(int c) {
		tablero = new boolean[c][c];
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
	}
	
	public void mostrarTablero() {
		
	}
	
	public void empezarJuego() {
		
	}
	
	public void reiniciarJuego() {
		
	}
	
	public void salirJuego() {
		
	}
}
