package edu.vitor.metodos;

public class Metodos2 {
	// Praticando Métodos

	boolean ligada = false;
	int canal = 1;
	int volume = 15;

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}

	public void aumentarVolume() {
		volume++;
	}
	public void diminuirVolume() {
		volume--;
	}

	public void aumentarCanal() {
		canal++;
	}
	public void diminuirCanal() {
		canal--;
	}
	public void mudarCanal (int novoCanal) {
		canal = novoCanal;
	}
}