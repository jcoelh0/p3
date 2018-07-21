package aula08.Ex1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

import aula08.Ex1.JogoDoGaloEngine.JogoTerminado;

public class Button extends JToggleButton{

	private static final long serialVersionUID = 1L;
	protected int i;
	protected int j;
	private JogoDoGalo Game;
	
	public Button(int i, int j, JogoDoGalo Game) {

		this.i = i;
		this.j = j;
		this.Game = Game;
		setVisible(true);
		this.setFont(new Font("", 1, 40));
		ActionListener a = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doGame();
			}
		};

		addActionListener(a);

	}

	public void doGame() {

		try {
			if (JogoDoGalo.jogo.jogadorX()) {
				setText("X");
			} else {
				setText("0");
			}
			
			this.setEnabled(false);
			
			JogoDoGalo.jogo.set(i, j, (JogoDoGalo.jogo.jogadorX()) ? 1 : -1);
			this.setEnabled(false);
			JogoDoGalo.jogo.jogador = (JogoDoGalo.jogo.jogadorX()) ? -1 : 1;

		} catch (JogoTerminado e) {
			Game.fim();
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}
}
