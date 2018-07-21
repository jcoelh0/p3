package aula06.Ex1;

public enum DiaSemana{
	
	Domingo(0), Segunda(1), Terça(2), Quarta(3), Quinta(4), Sexta(5), Sábado(6);
    
    private int num;

    private DiaSemana(int n) {
    	num = n;
    }

    public int getNum() {
    	return num;
    }
    
    
    //public static DiaSemana rand() {
	//	return values()[(int) (Math.random() * values().length)];
	//}
    public static DiaSemana rand() {
    	
        switch ((int) (Math.random() * 7)) {
         default: 
             case 0:
                 return Domingo;
             case 1:
                 return Segunda;
             case 2:
                 return Terça;
             case 3:
                 return Quarta;
             case 4:
                 return Quinta;
             case 5:
                 return Sexta;    
             case 6:
                 return Sábado;                        
                 
         }
     
     }
}