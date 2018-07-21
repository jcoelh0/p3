package aula05.Ex2;

public interface Policia{
	public static int id = 0;
	public enum Tipo{
		INEM, Bombeiros, GNR, PSP, PJ
	};
	public String getTipo();
	public String getID();
	public void setID(String ID);
}