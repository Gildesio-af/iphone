package iphone.entities;

import iphone.interfaces.InternetBrowser;
import iphone.interfaces.MusicPlayer;
import iphone.interfaces.Telephone;

public class Iphone implements Telephone, MusicPlayer, InternetBrowser{
	
	@Override
	public void showPage() {
		System.out.println("Mostrando a pagina.");
		
	}

	@Override
	public void addNewWindow() {
		System.out.println("Abrindo nova janela.");
		
	}

	@Override
	public void updatePage() {
		System.out.println("Pagina atualizada.");
		
	}

	@Override
	public void play() {
		System.out.println("Musica iniciada.");
	}

	@Override
	public void pause() {
		System.out.println("Musica pausada");
	}
	
	@Override
	public void selectMusic(String nameOfMusic) {
		System.out.println("Tocando: " + nameOfMusic);
	}

	@Override
	public void call() {
		System.out.println("Ligando.");
	}

	@Override
	public void acceptCall() {
		System.out.println("Ligacao aceita.");
		
	}

	@Override
	public void startVoicemail() {
		System.out.println("Gravando mensagem de voz.");
		
	}

}
