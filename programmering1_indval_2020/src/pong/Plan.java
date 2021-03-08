package pong;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;



public class Plan extends JPanel implements KeyListener{


	Player player1;
	Boll1 b;

	public Plan() {

		player1=new Player(this);

		b= new Boll1(this,player1);
		this.addKeyListener(this);

	}

	@Override
	public void keyPressed(KeyEvent e) {  // metod som hanterar knapptryckningar
		// TODO Auto-generated method stub

		player1.keyklick(e);


	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		b.paint(g);
		player1.paint(g);

	}
	@Override
	public boolean isFocusTraversable() {
		return true;
	}


}
