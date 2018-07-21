package aula02.Ex1;

import java.time.LocalDateTime;

public class socio {
	private static int numSocio = 0;
	private Data dataInsc;
	private Pessoa pessoa;
	video[] videos = new video[10000];
	static int x = 0;
	
	public socio(Pessoa pessoa) {
		numSocio++;
		LocalDateTime now = LocalDateTime.now();
		dataInsc = new Data(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
		this.pessoa = pessoa;
	}
	public int getNumSocio() {
		return numSocio;
	}
	public Data getDataInsc() {
		return dataInsc;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public video[] getVideos() {
		return videos;
	}
	public void setVideos(video filme) {
		videos[x++] = filme;
	}
	
	
}
