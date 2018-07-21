package aula01.Ex1;

import java.util.Scanner;

public class Ex1_1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduza uma frase:");
		String frase = sc.nextLine();
		int Numtotal = 0;
		boolean OnlyLower = true, OnlyUpper = true;
		String parts[] = frase.split(" ");
		
		for(int i = 0;i < frase.length();i++){
			if(!(frase.charAt(i)==' ')){
				if(Character.isDigit(frase.charAt(i))){
					Numtotal++;
				}
				if(!Character.isLowerCase(frase.charAt(i))){
					OnlyLower = false;
				}
				if(!Character.isUpperCase(frase.charAt(i))){
					OnlyUpper = false;
				}
			}
		}
		
		System.out.println("a) Total de caracteres numéricos:" + Numtotal);
		
		if(OnlyLower) System.out.println("b) Só tem letras minúsculas.");
		else System.out.println("b) Não é constituído só por letras minúsculas.");
		
		if(OnlyUpper) System.out.println("c) Só tem letras maiúsculas.");
		else System.out.println("c) Não é constituído só por letras maiúsculas.");
		
		System.out.print("d) É constituída por " + (parts.length) + " palavras: ");
		for(int i = 0;i < parts.length;i++){
			System.out.printf(parts[i]+" ");
		}
		
		String fraseTrocada[] = new String[parts.length];
		

		
		for(int i = 0;i < parts.length;i++){
			fraseTrocada[i] = " ";
			int impar = parts[i].length();
			for(int j = 0;j < parts[i].length();j++){
				
				if(j==parts[i].length()) break;
				if(!(parts[i].length() % 2 == 0)){
					if(impar!=1){
						fraseTrocada[i] = fraseTrocada[i] + Character.toString(parts[i].charAt(j+1));
						fraseTrocada[i] = fraseTrocada[i] + Character.toString(parts[i].charAt(j));
						impar=impar-2;
					}else fraseTrocada[i] += Character.toString(parts[i].charAt(parts[i].length()-1));
					
				}else{
					fraseTrocada[i] = fraseTrocada[i] + Character.toString(parts[i].charAt(j+1));
					fraseTrocada[i] = fraseTrocada[i] + Character.toString(parts[i].charAt(j));
				}
				j++;
			}
		}
		
		System.out.print("\ne) ");
		for(int i = 0;i < parts.length;i++){
			System.out.printf(fraseTrocada[i] +" ");
		}	
	}
}