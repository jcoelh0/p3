package aula12.Ex3.plugins;

import java.io.*;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import aula12.Ex3.Data;
import aula12.Ex3.Pessoa;
import aula12.Ex3.PluginInterface;
import aula12.Ex3.PluginManager;

public class Nokia extends PluginManager implements PluginInterface{
	
	public Set<Entry<String, Pessoa>> getFrom(File f){
		if(fileOK(f)){
			readFile(f);
			return entrySet();
		}else{
			return null;
		}
	}
	
	@Override
	public void readFile(File f){
		Scanner sc;
		
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException("Ficheiro n?o encontrado!");
		}
		try{
			while(sc.hasNextLine()){
				sc.nextLine();
				String name = sc.nextLine();
				int cc = Integer.parseInt(sc.nextLine());
				String[] ddns = sc.nextLine().split("/");
				Data ddn = new Data(Integer.parseInt(ddns[0]), Integer.parseInt(ddns[1]), Integer.parseInt(ddns[2]));
				add(name, ddn, cc);
			}
		}catch(NullPointerException e){
			sc.close();
			throw new IllegalArgumentException("Algo de errado se passou!");
		}
		sc.close();
	}

	@Override
	public void writeFile(Pessoa[] array, File f) {
		try {
			FileWriter wr = new FileWriter(f);
			wr.write("Nokia");
			wr.flush();
			for(int i=0; i<array.length-1; i++){
				wr.write("\n"+array[i].nome()+"\n"+array[i].cc()+"\n"+array[i].dataNasc()+"\n");
				wr.flush();
			}
			wr.write("\n"+array[array.length-1].nome()+"\n"+array[array.length-1].cc()+"\n"+array[array.length-1].dataNasc());
			wr.flush();
			wr.close();
		} catch (IOException e) {
			throw new IllegalArgumentException("Ficheiro inv?lido!");
		}
	}
}
