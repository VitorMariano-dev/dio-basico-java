package edu.vitor.metodos;

public class Usuario {

	public static void main(String[] args) {

		Metodos2 smartTv = new Metodos2();

		System.out.println("TV ligada? " + smartTv.ligada);
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);
		smartTv.desligar();
		System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);
		
		smartTv.aumentarVolume();
		System.out.println("Novo Status -> Volume atual: " + smartTv.volume);
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		System.out.println("Novo Status -> Volume atual: " + smartTv.volume);
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("Novo Status -> Volume atual: " + smartTv.volume);
		
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		System.out.println("Novo Status -> Canal atual: " + smartTv.canal);
		smartTv.diminuirCanal();
		smartTv.diminuirCanal();
		System.out.println("Novo Status -> Canal atual: " + smartTv.canal);
		
		smartTv.mudarCanal(13);
		System.out.println("Novo Status -> Canal atual: " + smartTv.canal);
	}

}
