package aula12.Ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.Scanner;

public class Reflection {
	static Scanner sc = new Scanner(System.in);
	static Constructor<?> constr;
	static LinkedList<Object> list = new LinkedList<>();
	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException{
		
		
		
		//System.out.print("Que classe deseja ler? ");
		//String classe = sc.nextLine();
		String classe = "aula04.Ex2.Circulo";
		//String classe1 = "aula04.Ex2.Figura";
		
		Class<?> cl = Class.forName(classe);
		
		printClassName(cl);
		System.out.println();
		printClass(cl);
		System.out.println();
		printFields(cl);
		System.out.println();
		Method[] meth = printMethods(cl);
		
		String verif = "yes";
		while(verif.equals("yes") || verif.equals("y") || verif.equals("sim") || verif.equals("s")){
			constr = printConstructors(cl);
			list.add(createObject(constr));
			System.out.println();
			
			
			
			for(Object b : list.toArray())
				System.out.println(b);
			System.out.print("\nObjeto criado com sucesso!");
			System.out.print("\nDeseja adicionar mais objetos?");
			verif = sc.next();
		}
		
		System.out.println("Deseja invocar um método sobre algum dos objetos?");
		verif = sc.next();
		
		while(verif.equals("yes") || verif.equals("y") || verif.equals("sim") || verif.equals("s")){
			
			int a = 1;
			for(Object b : list.toArray()){
				System.out.println(a + "- " + b);
				a++;
			}
			
			System.out.print("\nQual o objeto que quer usar?");
			@SuppressWarnings("unused")
			int object = sc.nextInt();
			
			int b = 1;
			for(Method m: meth){
				System.out.println(b + "- " + m);
				b++;
			}
			System.out.print("\nQual o método que quer usar?");
			@SuppressWarnings("unused")
			int metodo = sc.nextInt();
			//meth[metodo].invoke(list.get(object), null);
			
			
			System.out.print("\nDeseja invocar outro método sobre o objeto escolhido?");
			verif = sc.next();
		}
	}
	
	public static void printClassName(Object obj) {
		System.out.println("Name: " + obj + "\n" + 
						   "Simple Name: " + ((Class<?>) obj).getSimpleName());
	}
	
	public static Constructor<?> printConstructors(Object obj) {
		System.out.println("\n******** Construtores ***********************\n");
		Constructor<?> contrs[] = ((Class<?>) obj).getConstructors();
		int a = 1;
		for (Constructor<?> c: contrs){
			System.out.println(a + "- " + c);
			a++;
		}
		System.out.print("Escolha o construtor que pretende usar: ");
		
		return contrs[sc.nextInt()-1];
	}
	
	public static void printFields(Object obj) throws IllegalArgumentException, IllegalAccessException {
		System.out.println("\n******** Fields ***********************\n");
		Field fields[] = ((Class<?>) obj).getDeclaredFields();
		for (Field f: fields){
			System.out.println(f.toGenericString());
		}
	}
	
	public static Method[] printMethods(Object obj) {
		System.out.println("\n******** Methods ***********************\n");
		Method meth[] = ((Class<?>) obj).getMethods();
		for (Method m: meth)
			System.out.println(m.toString());
		return meth;
	}
	
	public static void printClass(Object obj){
		int m = ((Class<?>) obj).getModifiers(); // return the class modifiers
		if (Modifier.isPublic(m)) // checks if is public
			System.out.print("public ");
		if (Modifier.isStatic(m)) 
			System.out.print("static "); 
		if (Modifier.isAbstract(m)) // checks if it is abstract
			System.out.print("abstract ");
		if (Modifier.isFinal(m)) // checks if it is final
			System.out.print("final "); 
		System.out.print("class " + ((Class<?>) obj).getSimpleName()+" ");
		
		printExtends(obj);
		
		Class<?>[] intfs = ((Class<?>) obj).getInterfaces();
		if(intfs.length != 0)
			System.out.print("implements ");
			for (Class<?> s: intfs)
				System.out.println(s.getSimpleName());
		if(intfs.length > 1){
			int a=0;
			System.out.print("implements ");
			while(intfs.length!=a){
				for (Class<?> s: intfs){
					System.out.print(s.getSimpleName());
					if(intfs.length>a)
						System.out.print(", ");
				}
				a++;
			}
		}
	}
	
	
	public static void printExtends(Object obj){
		
		Class<?> clas = ((Class<?>) obj).getSuperclass();
		
		if(!(clas.getSimpleName()==null || clas.getSimpleName().length()==0 ||  clas.getSimpleName().equals("Object"))){
			System.out.print("extends ");
			System.out.print(((Class<?>) obj).getSuperclass().getSimpleName() + " ");
		}
	}
	
	private static Object createObject(Constructor<?> c2) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
	
		Class<?>[] paramTypes = c2.getParameterTypes();
		Object[] paramsObj = new Object[paramTypes.length];
		
		for(int i = 0; i < paramTypes.length; i++){
			System.out.print(paramTypes[i].getSimpleName()+": ");
			
			switch(paramTypes[i].getSimpleName()){
				case "double":
					paramsObj[i] = sc.nextDouble();
					break;
				case "int":
					paramsObj[i] = sc.nextInt();
					break;
				case "char":
					paramsObj[i] = sc.next().charAt(0);
					break;
				case "String":
					paramsObj[i] = sc.next();
					break;	
			}
		}
		Object obj = c2.newInstance(paramsObj);
		return  obj;
	}
	
}
