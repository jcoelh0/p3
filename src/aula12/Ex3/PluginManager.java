package aula12.Ex3;

import java.io.File;
import java.util.LinkedHashMap;
import java.io.FileNotFoundException;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PluginManager {
	
	private LinkedHashMap<String, Pessoa> list;
	private static LinkedHashMap<String, PluginInterface> plgs = new LinkedHashMap<>(); 
	
	public PluginManager(){
		this(new LinkedHashMap<String, Pessoa>());
	}
	
	public PluginManager(LinkedHashMap<String, Pessoa> list) {
		this.list = list;
	}
	
	public static void file() {
		
		File proxyList = new File("src/aula12/Ex3/plugins"); 
		
		for (String f: proxyList.list()) {
			try {
				plgs.put(f.substring(0,f.lastIndexOf('.')), PluginManager.load("aula12.Ex3.plugins."+
																	f.substring(0,f.lastIndexOf('.')))); 
			}catch (Exception e) { 
				e.printStackTrace();
			} 
		}
	
	}
	
	public static PluginInterface load(String name) throws Exception {
		
		Class<?> c = Class.forName(name);
		return (PluginInterface) c.newInstance(); 
	
	}
	
	public static Set<Entry<String, Pessoa>> importData(File f) {
	
		try {
			Scanner sc = new Scanner(f);
			String plugin = sc.nextLine();
			
			if(!plgs.containsKey(plugin)){
				sc.close();
				throw new IllegalArgumentException("Não existe esse Plugin!");
			}
			else{
				sc.close();
				return plgs.get(plugin).getFrom(f);
			}
			
		}catch(FileNotFoundException e){
			throw new IllegalArgumentException("Ficheiro não encontrado!");
		}	
		
	}
	
	public static void backup(String name, String plugin, Pessoa[] array){
		if(!plgs.containsKey(plugin)){
			throw new IllegalArgumentException("Não existe o Plugin!");
		}
		plgs.get(plugin).writeFile(array, new File(name));
	}
	
	public void add(String key, Pessoa value){
		this.list.put(key, value);
	}
	
	public void add(String name, Data ddn, int cc){
		add(name, new Pessoa(name, cc, ddn));
	}
	
	public static boolean fileOK(File f) {
	
		if(!f.exists()){
			throw new IllegalArgumentException("Ficheiro não existe!");
		}
		if(!f.canRead()){
			throw new IllegalArgumentException("não é possível ler o ficheiro!");
		}
		if(f.isDirectory()){
			throw new IllegalArgumentException("É um diretório!");
		}
		return true;

	}
	
	public static String pluginsListString(){
		String out = "";
		for(Entry<String, PluginInterface> entry : plgs.entrySet()){
			out += entry.getKey()+", ";
		}
		return out;
	}
	
	public Set<Entry<String, Pessoa>> entrySet(){
		return list.entrySet();
	}
}
