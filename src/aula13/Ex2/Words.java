package aula13.Ex2;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Words {
	
	static Scanner read;
	private Map<String, Pair> pairs;
	private char[] space = {' ','\t','\n','.',',',':','\'',';','?',
			'!','-','*','{','}','=','+','&','/','(',')','[',']','\"'}; 
	
	public Words(File file) {
	
		if(!file.exists()){
			throw new IllegalArgumentException("Ficheiro não existe!");
		}
		
		String line = "";
		
		try{
			read = new Scanner(file);
			while(read.hasNextLine()){
				line += (read.nextLine() + " ");
			}
			read.close();
		}catch(IOException e){
			System.err.println("Erro na leitura de ficheiro!");
		}
		
		if(line.length() != 0){
			pairs = split(line);
		}
		
	}
	
	private Map<String, Pair> split(String content) {
		
		Map<String, Pair> newPairs = new TreeMap<>();
		
		String key = "";
		String value = "";
		
		for(char c: content.toCharArray()){
			if(isSpace(c)){
				if(value.length() >= 3){
					if(key.length()==0){
						key = value;
					}else{						
						if(!newPairs.containsKey(key)){
							newPairs.put(key, new Pair(value));	
						}
						else{
							newPairs.get(key).newPair(value);
						}
						key = value;
					}
				}	
				value = "";		
			}else{
				value += c;
			}
		}	
		return newPairs;
	
	}
	
	private boolean isSpace(char c) {
		
		for(char a: space){
			if(a == c)
				return true;
		}
		return false;
		
	}
	
	private class Pair {
		
		private Map<String, Integer> pairValues = new LinkedHashMap<>(); 
		
		public Pair(String key){
			this.pairValues.put(key, 1);
		}
		
		public void newPair(String key){
			
			if(pairValues.containsKey(key)){
				pairValues.put(key, pairValues.get(key)+1);
			}
			else{
				pairValues.put(key, 1);
			}
		
		}
		
		@Override
		public String toString() {
		
			String out = "";
			
			for(Entry<String, Integer> entry : pairValues.entrySet()){
				out = entry.getKey() + "=" + entry.getValue() + ", " + out;
			}
			
			return out;
		}
	
	}
	
	public void saveInFile(File file) {
		
		try{
			OutputStream o = new FileOutputStream(file);
			Writer w = new PrintWriter(o);
			w.write(toString());
			w.close();
		}catch(IOException e) {
			System.err.println("Erro a guardar no ficheiro!");
		}
	
	}
	
	@Override
	public String toString() {
	
		String out = "";
		
		for(Entry<String, Pair> entry : pairs.entrySet()){
			out += entry.getKey() + "={" + entry.getValue() + "}\n";
		}
		
		return out;
	}

}