package aula09.Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("test.txt");
		
		System.out.println("Introduza uma frase:");
		System.out.println("normal:" + sc.nextLine());
		
		@SuppressWarnings("resource")
		ScannerAbeirense scA = new ScannerAbeirense(sc);
		@SuppressWarnings("resource")
		ScannerAbeirense scA2 = new ScannerAbeirense(new Scanner(f));
		
		System.out.println("Introduza uma frase:");
		System.out.println("aveiro:" + scA.nextLine());
		
		while(scA2.hasNext())
			System.out.println(scA2.nextLine());
		
	}
}
