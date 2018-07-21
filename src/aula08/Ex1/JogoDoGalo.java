package aula08.Ex1;

import java.awt.*;
import javax.swing.*;

public class JogoDoGalo extends JFrame{

	private static final long serialVersionUID = 1L;
	protected static JogoDoGaloEngine jogo;
	
	public static void main(String[] args){
		
		jogo = new JogoDoGaloEngine();
		JogoDoGalo gui = new JogoDoGalo();
		gui.setDefaultCloseOperation(3);
		
	}
	
	public JogoDoGalo() {
		
		JFrame f = new JFrame("Jogo do Galo");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setSize(700,700);
		
	    JPanel panel = new JPanel();
	    panel.setLayout(new GridLayout(3, 3));
	    
	    for(int i=1; i<=3; i++)
	    	for(int j=1; j<=3; j++)
	    		panel.add(new Button(i, j, this));
	    
	    add(panel, BorderLayout.CENTER);
	    
	    f.setContentPane(panel); 
	    f.setVisible(true);
		
	}
	
	protected void fim(){
		
		String result = "";
		
		if(jogo.vencedor()==1)
			result = "O jogador X venceu!";
		else if(jogo.vencedor()==-1)
			result = "O jogador O venceu!";
		else if(jogo.vencedor()==0)
			result = "Empate!";
		else
			return;
		JOptionPane.showMessageDialog(this.getContentPane(), "Resultado: " + result);
		System.exit(0);
		
	}

}