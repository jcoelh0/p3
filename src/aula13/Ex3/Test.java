package aula13.Ex3;

public class Test {
    public static void main(String[] args){
	Employees e = new Employees();
	
	e.add("Joao Lopes");
	e.add("Pedro Neistat");
	e.add("Alberto Leit�o");
	e.add("Maria Fonseca");
	
	e.BrinquedoGratis();
	e.list();
	System.out.println(e.getNum());
	e.remove("Jo�o Lopes1");
	e.remove("Joao Lopes");
	
	e.list();
	System.out.println(e.getNum());
	e.list();
	
	e.remove("Jo�o Lopes");
	e.list();
	e.remove("Maria Fonseca");
	System.out.println(e.getNum());
	e.list();
	System.out.println();
	e.BrinquedoGratis();
	e.list();
    }
}
