package aula11.Ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class TesteD {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		File f = new File("test.txt");
	
		try{
			sc = new Scanner(new FileInputStream(f));
		
			TreeMap<String, Integer> map = new TreeMap<String, Integer>(new ModComparator());
			ArrayList<String> list = new ArrayList<>();
			
			while(sc.hasNext()){
				list.add(sc.next());
			}
			
			for(int i = 0; i<list.size(); i++){
				String word = list.get(i);
				if(!map.containsKey(word))
					map.put(word, 1);
				else map.put(word, map.get(word)+ 1);
			}
			
			Iterator<?> iterator= map.entrySet().iterator();
			
		    while (iterator.hasNext()) {
		    	
				@SuppressWarnings("rawtypes")
				HashMap.Entry pair = (Entry) iterator.next();
		        System.out.println(pair.getKey() + "			" + pair.getValue());
		    }
			
		}catch(FileNotFoundException e){
			System.err.println("Ficheiro não encontrado!");
		}
	}
}