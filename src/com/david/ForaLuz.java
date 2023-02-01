package com.david;

public class ForaLuz {
	boolean[][] tablero;
	
	public ForaLuz(int c) {
		tablero = new boolean[c][c];
		mostrarMenu();
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
	}
}
