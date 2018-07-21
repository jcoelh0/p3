package aula05.Ex3;

import static java.lang.System.out;
import java.io.*;
import java.util.Scanner;

public class Agenda {
	static Scanner sc = new Scanner(System.in);
	public static int i = 0;
	public static Pessoa[] pessoas = new Pessoa[100000];
	public static void main(String[] args) {
		
        while(true){
			int k = menu();
			switch(k){
				case 1:
					addPessoa();
					break;
				case 2:
					i = removePessoa(pessoas,i);
					break;
				case 3:
					finalPrint(pessoas,i);
					break;
				case 4:
					ordenarNome(pessoas, i);
					break;
				case 5:
					ordenarCC(pessoas, i);
					break;
				case 6:
					System.exit(1);
					break;
			}
		}
	}

	public static int menu() {
		System.out.println("Menu:");
		System.out.println("1- Adicionar nova pessoa à lista");
		System.out.println("2- Remover pessoa da lista");
		System.out.println("3- Apresentar a lista completa");
		System.out.println("4- Apresentar a lista completa ordenada por nome");
		System.out.println("5- Apresentar a lista completa ordenada por Núm. CC");
		System.out.println("6- Sair");
		System.out.print("Opção: ");
		int k = sc.nextInt();
		return k;
	}

	public static void addPessoa() {

		System.out.print("Para introduzir manualmente (m) ou importar de um ficheiro (f): ");
		String resposta = sc.nextLine();

		if (resposta.equalsIgnoreCase("f")) {
			int nFiles = 1;
			while (nFiles < 4) {
				String filename = "File" + nFiles++ + ".txt";
				File f = new File(filename);

				if (!f.exists()) {
					System.err.println("O ficheiro não existe!");
					break;
				}
				if (f.isDirectory()) {
					System.err.println("O ficheiro é um directório.");
					break;
				}
				if (!f.canRead()) {
					System.err.println("Não foi possível ler o ficheiro.");
					break;
				}

				try {
					Scanner read = new Scanner(f);

					String line = read.nextLine();
					int previousSize = i;

					if (line.equals("Nokia")) {
						Nokia nokia = new Nokia(f);
						Pessoa toAdd[] = nokia.addContacts();

						for (int j = 0; j < toAdd.length; j++) {
							pessoas[i++] = toAdd[j];
						}

					} else if (line.equals("vCard")) {
						vCard vCard = new vCard(f);
						Pessoa toAdd[] = vCard.addContacts();
						for (int j = 0; j < toAdd.length; j++) {
							pessoas[i++] = toAdd[j];
						}
					} else if (line.equals("CSV")) {
						CSV csv = new CSV(f);
						Pessoa toAdd[] = csv.addContacts();
						for (int j = 0; j < toAdd.length; j++) {
							pessoas[i++] = toAdd[j];
						}
					} else {
						System.out.println("Nenhum ficheiro reconhecido!");
						read.close();
					}

					System.out.println("O ficheiro \"" + filename + "\" que continha contactos na forma \"" + line
							+ "\" foi processado com sucesso!");
					System.out.println("Foram adicionados os seguintes contactos:\n");
					for (int j = previousSize; j < i; j++) {
						System.out.println(pessoas[j].toString());
					}
					System.out.println();
				} catch (FileNotFoundException e) {
					System.out.println("ERRO!");
				}
			}
		} else {
			System.out.println("----Introdução manual----");
			System.out.print("Nome da pessoa:");
			sc.nextLine();
			String nome = sc.nextLine();

			int cc;
			do {
				System.out.print("Número de cartão de cidadão:");
				cc = sc.nextInt();
				if (cc < 10000000 || cc > 99999999)
					out.println("Número do cartão de cidadão inválido!");
			} while (cc < 10000000 || cc > 99999999);

			int dia = 0;
			int mes = 1;
			int ano = 1901;
			while (!Data.dataValida(dia, mes, ano)) {
				System.out.println("Data de nascimento");
				System.out.print("Dia:");
				dia = sc.nextInt();

				System.out.print("Mês:");
				mes = sc.nextInt();

				System.out.print("Ano:");
				ano = sc.nextInt();
				if (!Data.dataValida(dia, mes, ano))
					System.out.println("Data de nascimento inválida!");
			}
			Data data = new Data(dia, mes, ano);
			Pessoa p = new Pessoa(nome, cc, data);
			pessoas[i++] = p;
		}
	}

	public static int removePessoa(Pessoa[] pessoas, int i){
		System.out.print("Nome da pessoa que deseja eliminar:");
		sc.nextLine();
		String delete = sc.nextLine().trim();
		for(int k = 0; k < i-1; k++){
			if(delete.equals(pessoas[k].nome())){
				System.out.println("Pessoa removida com sucesso!");
            	for(int j = k; j < pessoas.length-1; j++)
                	pessoas[k] = pessoas[k+1];
                i--;
			}
		}
	    return i;
		
	}
	
	public static void ordenarNome(Pessoa[] first, int k){
    	
        Pessoa[] pessoas = new Pessoa[100000];
        
        for(int i=0; i<k; i++)
            pessoas[i] = first[i];
        
        for(int i=0; i<k-1; i++){
            for(int j=i; j<k; j++){
                if(pessoas[i].nome().compareTo(pessoas[j].nome()) > 0){ 
                	Pessoa temp;
                	temp = pessoas[i];
                	pessoas[i] = pessoas[j];
                	pessoas[j] = temp;
                }
            }
        }
        finalPrint(pessoas, k); 
    }
    
    public static void ordenarCC(Pessoa[] original, int k){
       
        Pessoa[] pessoas = new Pessoa[100000];
        
        for(int i=0; i<k; i++)
            pessoas[i] = original[i];
        
        for(int i=0; i<k-1; i++){
            for(int j=i; j<k; j++){
                if(pessoas[i].cc() > pessoas[j].cc()){
                    Pessoa temp;
                    temp = pessoas[i];
                    pessoas[i] = pessoas[j];
                    pessoas[j] = temp;
                }
            }
        }
        finalPrint(pessoas, k);    
    }
	
    public static void finalPrint(Pessoa[] pessoas, int j){
    	for(int k=0; k<=j-1; k++){            
    		System.out.println(pessoas[k].toString());
    	}
    }
}