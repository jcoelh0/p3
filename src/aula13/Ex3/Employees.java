package aula13.Ex3;

import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Employees {
	static Map<Integer, String>	map	= new TreeMap<Integer, String>();
	static Map<String, String> brinquedos = new TreeMap<String, String>();
	static TreeMap<String, Integer> primNome = new TreeMap<String, Integer>();
	private static int			num	= 0;
	private static int i = 0;
	static Set<String> nomes = new HashSet<String>();
	
	public Employees() {

	}

	public void add(String nome) {
		map.put(num, nome);
		num++;
	}

	public void list() {
		for (Entry<Integer, String> empreg : map.entrySet()) {
			System.out.println("Nome: " + empreg.getValue());
		}
	}

	public void remove(String nome) {
		int check = -2;
		
		Map<Integer, String> tempMap = new TreeMap<Integer, String>();
		int i = 0;
		for (Entry<Integer, String> empreg : map.entrySet())
			if (!nome.equalsIgnoreCase(empreg.getValue())) {
				tempMap.put(i, empreg.getValue());
				i++;
			} else {
				System.out.println("Empregado removido com sucesso!");
				check = 0;
				
			}
		if (check == -2)
			System.out.println("Não foi possível remover o empregado do sistema!");
		else{
			num--;
			map.clear();
			map.putAll(tempMap);
		}
	}

	public int getNum() {
		return num;
	}

	public void BrinquedoGratis() {
		
		Random rand = new Random();
		int randomNum = rand.nextInt(num);
		String sortudo = map.get(randomNum);
		System.out.println(randomNum + "Este mês o sortudo foi o/a " + sortudo);
		brinquedos.put(sortudo, "brinquedo" + i++);
	}
	
	public void quantosPrimeiroNome(){
		for (Entry<Integer, String> empreg : map.entrySet()) {
			String[] splits = empreg.getValue().split(" ");
			if(!primNome.containsKey(splits[0]))
				primNome.put(splits[0], 1);
			else primNome.put(splits[0], primNome.get(splits[0])+ 1);
		}
	}
	
	
	
	
	
	
	
	
	
}
