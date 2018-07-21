package aula04.Ex3;


public class video {
	private static int ID = 1;
	private String titulo;
	private String categoria;
	private String idade;
	private boolean available = true;
	private int z = 0;
	private int rating = 0;
	private int numPpl = 0;
	Cliente[] socio = new Cliente[10000];

	public video(String titulo, String categoria, String idade) {
		ID = ID++;
		this.titulo = titulo;
		this.categoria = categoria;
		this.idade = idade;
	}

	public int getID() {
		return ID;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getIdade() {
		return idade;
	}

	public boolean isAvailable() {
		return available;
	}

	public int getRating() {
		return rating;
	}

	public int getMedia() {

		int media = rating / numPpl;

		return media;
	}

	public int getNumPessoas() {
		return numPpl;
	}

	public void setRating(int ranking) {
		rating = rating + ranking;
		numPpl++;
	}

	public void setDisponivel(boolean available) {
		this.available = available;
	}

	public void setSocio(Cliente socio) {
		this.socio[z] = socio;
		z++;
	}

	public Cliente getSocios() {
		return socio[z];
	}

	public Cliente[] getSocio() {
		return socio;
	}
	
	public int getZ(){
		return z;
	}

	public String toString() {
		return "Titulo:" + titulo + ", categoria:" + categoria + ", idade:" + idade
				+ "rating:" + rating;
	}
	
}
