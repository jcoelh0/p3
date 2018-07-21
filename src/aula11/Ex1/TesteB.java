package aula11.Ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class TesteB {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		File f = new File("test.txt");
		int count = 0;
		
		try{
			sc = new Scanner(new FileInputStream(f));
		
			HashSet<String> s = new HashSet<>();
			ArrayList<String> list = new ArrayList<>();
			
			while(sc.hasNext()){
				list.add(sc.next());
				count++;
			}
			
			for(int i = 0; i<list.size(); i++)
				s.add(list.get(i));
			
			System.out.println("Número Total de Palavras: " + count);
			System.out.println("Número de Diferentes Palavras: " + s.size());
			
		}catch(FileNotFoundException e){
			System.err.println("Ficheiro não encontrado!");
		}
	}
}