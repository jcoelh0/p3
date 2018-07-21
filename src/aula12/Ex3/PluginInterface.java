package aula12.Ex3;

import java.io.File;
import java.util.Map.Entry;
import java.util.Set;

public interface PluginInterface {
	public Set<Entry<String, Pessoa>> getFrom(File f);
	public void readFile(File f);
	public void writeFile(Pessoa[] array, File f);
}