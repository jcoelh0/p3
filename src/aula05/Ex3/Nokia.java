package aula05.Ex3;

import java.io.*;
import java.util.Scanner;

public class Nokia implements Documento {
	
	File file;
	Scanner sc;
	
	public Nokia(File file){
		this.file = file;
	}
	
	@Override
	public Pessoa[] addContacts(){
		
		Pessoa pessoas[] = new Pessoa[10000];
		int size = 0;
		int count = 0;
		String nome = "", data = "";
		int n = 0;
		sc.nextLine();
	
		while(sc.hasNextLine()){
			count++;
		
			if (count == 1) {
				nome = sc.nextLine();
			} else if (count == 2) {
				n = sc.nextInt();
			} else if (count == 3) {
				data = sc.nextLine();
			
				String date[] = data.split("/");
				
				Pessoa p = new Pessoa(nome, n, new Data(Integer.parseInt(date[0]), 
							Integer.parseInt(date[1]), Integer.parseInt(date[2])));
				
				pessoas[size++] = p;
			} else if (count == 4) {
				count = 0;
				sc.nextLine();
			}
		}
		
		Pessoa lista[] = new Pessoa[size];
		for (int i = 0; i < size; i++) {
			lista[i] = pessoas[i];
		}
		
		return lista;
	}
	
}