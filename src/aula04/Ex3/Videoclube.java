package aula04.Ex3;

import java.util.Scanner;

public class Videoclube {
	static Scanner sc = new Scanner(System.in);
	static int i = 0; // videos
	static int I = 0; // socios

	public static void main(String[] args) {

		video[] filmes = new video[100000];
		Cliente[] ppl = new Cliente[100000];
		while (true) {
			int a = menu.Menu();
			// System.out.println(a);
			switch (a) {
			case 11:
				addVideo(filmes);
				break;
			case 12:
				removeVideo(filmes);
				break;
			case 13:
				searchVideo(filmes);
				break;
			case 14:
				rating(filmes);
				break;
			case 15:
				classificacao(filmes);
				break;
			case 21:
				addPessoa(ppl);
				break;
			case 22:
				removePessoa(ppl);
				break;
			case 23:
				historicoVideosEmprestados(ppl, filmes);
				break;
			case 31:
				checkOut(ppl, filmes);
				break;
			case 32:
				checkIn(ppl, filmes);
				break;
			case 33:
				identifyUser(filmes);
				break;
			}
		}
	}

	public static void addPessoa(Cliente[] socio) {
		System.out.print("Cartão de Cidadão:");
		int cc = sc.nextInt();
		System.out.print("Nome:");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.println("Data de nascimento");
		System.out.print("Dia:");
		int dia = sc.nextInt();
		System.out.print("Mês:");
		int mes = sc.nextInt();
		System.out.print("Ano:");
		int ano = sc.nextInt();

		Data nasc = new Data(dia, mes, ano);

		String tipo = "s";
		Cliente p1 = null;
		boolean check = false;
		sc.nextLine();
		
		do {
			System.out.println("Estudante ou funcionário?(E/F)");
			tipo = sc.nextLine();

			if (tipo.equals("e") || tipo.equals("E")) {
				check = true;
				System.out.print("Número Mecanográfico:");
				int nMec = sc.nextInt();
				System.out.print("Curso:");
				sc.nextLine();
				String curso = sc.nextLine();

				p1 = new Estudante(cc, nome, nasc,nMec,curso);
				
			} else if (tipo.equals("f") || tipo.equals("F")) {
				check = true;
				System.out.print("Número de funcionário: \n");
				int nFunc = sc.nextInt();
				System.out.print("Número fiscal: \n");
				int nFisc = sc.nextInt();
				
				p1 = new Funcionario(cc, nome, nasc, nFunc, nFisc);
			}
		} while (check == false);
		
		socio[I++] = p1;
	}

	public static void removePessoa(Cliente[] socio) {

		System.out.println("Número de sócio:");
		int numSocio = sc.nextInt();

		for (int i = 0; i < I; i++) {
			if (numSocio == socio[i].getId()) {

				System.out.printf("Utilizador %s eliminado!\n", socio[i].getNome());

				for (int j = i; j < socio.length - 1; j++)
					socio[i] = socio[i + 1];

				I--;

			} else
				System.out.println("Utilizador não encontrado!");
		}
	}

	public static void addVideo(video[] filmes) {

		System.out.print("Título:");
		String tit = sc.nextLine();
		System.out.print("Categoria:");
		String cat = sc.nextLine();
		boolean valido = false;
		String idade = "";
		do {
			System.out.print("Restrição de idade(ALL, M6, M12, M16, M18):");
			idade = sc.nextLine();
			if (idade.equals("ALL") || idade.equals("M6") || idade.equals("M12") || idade.equals("M16")
					|| idade.equals("M18"))
				valido = true;
		} while (valido == false);

		filmes[i++] = new video(tit, cat, idade);
	}

	public static void removeVideo(video[] filmes) {
		System.out.println("ID do video a eliminar: ");
		int id = sc.nextInt();
		for (int k = 0; k < filmes.length; k++) {
			if (id == filmes[i].getID()) {
				for (int j = k; j < filmes.length - 1; j++)
					filmes[k] = filmes[k + 1];
			}
		}
	}

	public static void searchVideo(video[] filmes) {
		System.out.println("ID do filme a procurar:");
		int id = sc.nextInt();
		for (int i = 0; i < filmes.length; i++) {
			if (id == filmes[i].getID()){
				if (available(filmes, id)){
					System.out.print("O filme está disponível para alugar!\n");
					break;
				}else{
					System.out.print("O filme não está disponível para alugar!\n");
					break;
				}
			}
		}
	}

	public static boolean available(video[] filmes, int id) {
		for (int i = 0; i < filmes.length; i++) {
			if (id == filmes[i].getID()) {
				if (filmes[i].isAvailable())
					return true;
				else
					return false;
			}
		}
		return true;
	}

	public static void checkOut(Cliente[] socio, video[] filmes) {
		System.out.println("Id do filme: ");
		int id = sc.nextInt();
		
		assert available(filmes,id);

		System.out.print("Número de sócio: \n");
		int numSocio = sc.nextInt();

		for (int k = 0; k < i; k++) {
			if (id == filmes[k].getID()) {
				for (int j = 0; j < I; j++) {
					if (numSocio == socio[j].getId()) {
						boolean disponivel = false;

						filmes[k].setDisponivel(disponivel);
						socio[j].setFilme(filmes[j]);
						filmes[k].setSocio(socio[j]);
					}
				}
			}
		}
	}

	public static void checkIn(Cliente[] socio, video[] filmes) {

		System.out.print("ID do video: \n");
		int id = sc.nextInt();

		System.out.print("Classificaçção do vídeo (1-10):");
		int classificacao;

		do {
			classificacao = sc.nextInt();

			if (classificacao < 1 || classificacao > 10) {
				System.out.println("Classificacao invalida!");
			}

		} while (classificacao < 1 || classificacao > 10);

		for (int k = 0; k < i; k++) {
			if (id == filmes[k].getID()) {
				boolean disponivel = true;
				filmes[k].setDisponivel(disponivel);
				filmes[k].setRating(classificacao);
			}
		}

	}

	public static void identifyUser(video[] filmes) {

		System.out.println("ID do vídeo: ");
		int id = sc.nextInt();

		for (int k = 0; k < i; k++) {
			if (id == filmes[k].getID()) {
				System.out.print("Lista: \n");
				Cliente[] socio = filmes[k].getSocio();

				for (int j = 0; j < filmes[k].getZ(); j++) {
					System.out.print("Cliente: \n");
					System.out.println(socio[j].toString());
				}
			}
		}
	}

	public static void classificacao(video[] filmes) {

		System.out.println("ID do video: ");
		int id = sc.nextInt();

		for (int i = 0; i < i; i++) {
			if (id == filmes[i].getID())
				System.out.printf("\nClassificação total: %d || Número de vezes que foi alugado: %d "
						+ "|| Média da classificação: %d",filmes[i].getRating(), 
						filmes[i].getNumPessoas(), filmes[i].getMedia());
		}
	}

	public static void rating(video[] filmes) {

		video[] v = new video[i];

		for (int k = 0; k < i; k++)
			v[k] = filmes[k];

		for (int k = 0; k < i - 1; k++) {
			for (int j = k; j < i; j++) {
				if (v[k].getMedia() < v[j].getMedia()) {
					video s;

					s = v[k];
					v[k] = v[j];
					v[j] = s;
				}
			}
		}

		for (int i = 0; i < i; i++)
			System.out.println(v[i].toString());

	}

	public static void historicoVideosEmprestados(Cliente[] socio, video[] filmes) {

		System.out.println("Número de sócio: ");
		int numSocio = sc.nextInt();
		video[] v;

		for (int k = 0; k < I; k++) {
			if (numSocio == socio[k].getId()) {
				v = socio[k].getVideos();
				System.out.println("Videos:");
				for (int j = 0; j < filmes.length; j++)
					System.out.println(v[k] + " ");
			}
		}
	}
}
