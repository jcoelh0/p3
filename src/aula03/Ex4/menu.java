package aula03.Ex4;

import java.util.Scanner;

public class menu {
	static Scanner sc = new Scanner(System.in);
	public static int Menu() {
		int a = 0;
		int k;
		k = menu_videoclub();
		
		switch(k){	
			case 1:
				a = menu_video();
				a +=10;
				break;
			case 2:
				a = menu_user();
				a +=20;
				break;
			case 3:
				a = menu_emprest();
				a +=30;
				break;
			case 4:
				System.exit(0);
			}
		return a;
	}
	
	public static int menu_videoclub(){
		System.out.println("V�deoclube");
		System.out.println("1- Cat�logo de v�deos");
		System.out.println("2- Utilizadores");
		System.out.println("3- Empr�stimos");
		System.out.println("4- Sair");
		System.out.print("Op��o:");
		int k = sc.nextInt();
		return k;
	}
	
	public static int menu_video(){
		System.out.println("V�deoclube - Cat�logo de v�deos");
		System.out.println("1- Introduzir filme");
		System.out.println("2- Remover filme");
		System.out.println("3- Pesquisar filme");
		System.out.println("4- Listar filmes por rating");
		System.out.println("5- Ver rating de um filme");
		//System.out.println("4- Voltar");
		System.out.print("Op��o:");
		int k = sc.nextInt();
		return k;
	}
	public static int menu_user(){
		System.out.println("V�deoclube - Gest�o de utilizadores");
		System.out.println("1- Criar novo utilizador");
		System.out.println("2- Remover um utilizador");
		System.out.println("3- Listar hist�rico de filmes emprestados de um s�cio");
		//System.out.println("4- Voltar");
		System.out.print("Op��o:");
		int k = sc.nextInt();
		return k;
	}
	public static int menu_emprest(){
		System.out.println("V�deoclube - Empr�stimos");
		System.out.println("1- Empr�stimo (checkout)");
		System.out.println("2- Devolu��o (checkin)");
		System.out.println("3- Identificar os utilizadores que requisitaram determinado filme");
		
		//System.out.println("4- Voltar");
		System.out.print("Op��o:");
		int k = sc.nextInt();
		return k;
	}
}
