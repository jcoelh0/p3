package aula03.Ex4;

public class Cliente{
	
	private int id;
    private String nome;
    private int cc;
    private Data dataNasc;
    private int nMec;
    private int nFunc;
    private int nFisc;
    private String curso;
    video[] videos = new video[1000000];
    private static int x = 1;
    
    public Cliente(int cc, String nome, Data dataNasc){
        
    	this.id = x;
        this.cc = cc;
        this.nome = nome;
        this.dataNasc = dataNasc;
        x++;	
        
    }
    
    public Cliente(int cc, String nome, Data nasc, int nMec, String curso, int id){
        this.id = id;
        this.cc = cc;
        this.nome = nome;
        this.dataNasc = nasc;
        this.nMec = nMec;
        this.curso = curso;
    }
    
    public Cliente(int cc, String nome, Data nasc, int nMec, String curso){
        this.cc = cc;
        this.nome = nome;
        this.dataNasc = nasc;
        this.nMec = nMec;
        this.curso = curso;
    }
    
    public Cliente(int cc, String nome, Data nasc, int nFunc, int nFisc){
        this.cc = cc;
        this.nome = nome;
        this.dataNasc = nasc;
        this.nFunc = nFunc;
        this.nFisc = nFisc;
    }
    public int getId(){
        return id;
    }

    public int getCc(){
        return cc;
    }

    public String getNome(){
        return nome;
    }

    public Data getDataNasc(){
        return dataNasc;
    }

    public int getNMec(){
        return nMec;
    }

    public int getNFunc(){
        return nFunc;
    }

    public int getNFisc(){
        return nFisc;
    }

    public String getCurso(){
        return curso;
    }
    
    public video[] getVideos(){
        return videos;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public void setCc(int cc){
        this.cc = cc;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNasc(Data nasc){
        this.dataNasc = nasc;
    }

    public void setnNec(int nMec){
        this.nMec = nMec;
    }

    public void setNFunc(int nFunc){
        this.nFunc = nFunc;
    }

    public void setNFisc(int nFisc){
        this.nFisc = nFisc;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public void setFilme(video filme){
        
        videos[x]=filme;
        x++;
    
    }
    
    public String toString(){
        
        String str = "Nome: " + nome + " Numero de socio: " + id + " Cartao de cidadao: " + cc;
                    
        return str;
    }
    
}