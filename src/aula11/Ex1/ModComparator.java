package aula11.Ex1;

import java.util.Comparator;

public class ModComparator implements Comparator<String> {
	public int compare(String a, String b) {
		return a.compareTo(b);
	}
}