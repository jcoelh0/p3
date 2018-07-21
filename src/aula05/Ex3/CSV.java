package aula05.Ex3;

import java.io.File;
import java.util.Scanner;

public class CSV implements Documento{
	File file;
	Scanner sc;
	
	public CSV(File file){
		this.file = file;
	}
	
	@Override
	public Pessoa[] addContacts(){
		int size = 0;
		Pessoa pessoas[] = new Pessoa[10000];
		sc.nextLine();
		
		while(sc.hasNextLine()){
	
			String s = sc.nextLine();
			String info[] = s.split("	");
			
			String date[] = info[2].split("/");
				
			int num = Integer.parseInt(info[1]);
				
			Pessoa p = new Pessoa(info[0], num, new Data(Integer.parseInt(date[0]), 
							Integer.parseInt(date[1]), Integer.parseInt(date[2])));
				
			pessoas[size++] = p;
			
			sc.nextLine();
			
		}
		
		Pessoa lista[] = new Pessoa[size];
		for (int i = 0; i < size; i++) {
			lista[i] = pessoas[i];
		}
		
		return lista;
	}
}
