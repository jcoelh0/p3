package aula13.Ex2;
import java.io.*;
import java.util.*;

public class Test{
	
	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.print("Nome do ficheiro: ");
		String ficheiro = read.nextLine();
		read.close();

		Words w = new Words(new File(ficheiro));
		System.out.println(w);
		w.saveInFile(new File("output.txt"));
	
	}
		
}