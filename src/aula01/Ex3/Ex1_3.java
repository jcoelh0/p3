package aula01.Ex3;

import java.util.Scanner;

public class Ex1_3 {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        int opcao;
         
        while(true){
            opcao=menu();
            switch(opcao){
            case 1: quadrado(); break;
            case 2: retangulo(); break;
            case 3: circulo(); break;
             
            }
        }

	}
	public static int menu(){
	     
	    System.out.println("1:Quadrado");
	    System.out.println("2:Retangulo");
	    System.out.println("3:Circulo");
	    int opcao = sc.nextInt();
	    return opcao;
	}
	public static void quadrado() {
        System.out.println("Lado:");
        int lado = sc.nextInt();
        Quadrado quad = new Quadrado(lado);
        System.out.println("Area:" + quad.area());
        System.out.println("Perimetro" + quad.perimetro());
    }
	public static void retangulo(){
		System.out.println("comprimento:");
		int comp=sc.nextInt();
		System.out.println("largura:");
		int larg=sc.nextInt();
		Retangulo retang=new Retangulo(comp,larg);
		System.out.println("Area:"+retang.area());
		System.out.println("Perimerto:"+retang.perimetro());	
	}
	public static void circulo(){
		System.out.println("Raio:");
        double raio=sc.nextDouble();
        System.out.println("Abcissa:");
        double x=sc.nextDouble();
        System.out.println("Ordenada:");
        double y=sc.nextDouble();
        Circulo circ=new Circulo(raio,x,y);
		System.out.println("1:Calcular area e perimetro");
        System.out.println("2:Verifique se dois Círculos são iguais");
        System.out.println("3:Verifique se dois Círculos se interceptam;");
        int op=sc.nextInt();
        if(op==1){
        	System.out.println("Area:"+circ.area());
        	System.out.println("Perimetro:"+circ.perimetro());
        	}
        if(op==2){
        	System.out.println("Circulo2:");
        	System.out.println("Raio:");
            double raio2=sc.nextDouble();
            System.out.println("Abcissa:");
            double x2=sc.nextDouble();
            System.out.println("Ordenada:");
            double y2=sc.nextDouble();
            Circulo circ2=new Circulo(raio2,x2,y2);
        	if(circ.getRaio()==circ2.getRaio()) System.out.println("Os circulos são iguais");
        	else System.out.println("Os circulos são diferentes");}
        if(op==3){
        	System.out.println("Circulo2:");
        	System.out.println("Raio:");
            double raio3=sc.nextDouble();
            System.out.println("Abcissa:");
            double x3=sc.nextDouble();
            System.out.println("Ordenada:");
            double y3=sc.nextDouble();
            Circulo circ3=new Circulo(raio3,x3,y3);
        	if(circ.getCentro()==circ3.getCentro()) 
        		if(circ.getRaio()==circ3.getRaio()){
        		System.out.println("Os circulos intercetam-se");}
        		else System.out.println("Os circulos nao se intercetam");
        	else{
	        	double distCentrosX = Math.abs(circ.getCentro().getX()
	                    - circ3.getCentro().getX());
	            double distCentrosY = Math.abs(circ.getCentro().getY()
	                    - circ3.getCentro().getY());
	            double distCentros = Math.sqrt(distCentrosX * distCentrosX
	                    + distCentrosY * distCentrosY);
	     
	            if (circ.getRaio() + circ3.getRaio() >= distCentros)
	                System.out.println("Os circulos intercetam-se");
	            else
	                System.out.println("Os circulos nao se intercetam");
        	}
        }
	}
}
        	
	


