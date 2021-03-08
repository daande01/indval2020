package pong;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Boll1 extends JComponent {

	private int radie = 20; // instansvariabel alltså alla olika boll1 objekt kommer att få en alldeles egen
							// radie behållare.
	private Color c = Color.orange; // instansvariabel, bollens framtida färg
	private int x = 20;// instansvariabel , bollens x kordinat
	private int y = 20;// instansvariabel, bollens y kordinat
	private int vy = 1;// instansvariabel, bollens hastighet i y led
	private int vx = 1;// instansvariabel, bollens hastighet i x led
	Player p1;
	private JPanel jp; // skapar en jframe behållare så att vi kan ha en känner till relation till vår
						// jframe så att vi kan fåreda på exempelvis hur stor arbetsytan är
						// (contentpane)

	public Boll1(JPanel jp, Player p1) {// konstruktor som tar i mot jframe som inparameter

		this.jp= jp;// lagra inparametern i instansvariabel för framtida bruk , så att vi i
		this.p1=p1;


		// framtiden kan kontrollera storleken på arbets ytan , kan ju haända att den
						// blir större om användaren drar i fönstret

		Timer t = new Timer(20, e -> { // timer koden inne i kroppen på denna timer kommer att exekveras var 20
										// milliesekund.tänk på att denna timer måste importeras från swing paketet och
										// inte något annat paket då kommer den inte att fungera.

			move(); // kallar på metoden move som flyttar bollen och kollar så att vi inte träffar
					// något

			jp.repaint(); // ritar om allt

		});
		t.start(); // startar timern har ni inte med denna så kommer de inte att hända något.

	}

	private void move() { // metod för att flytta bollen och kolla om kollition med vägg
		x += vx; // flyttar i x led
		// vy = vy + 2;// gravitation
		y += vy; // flyttar i y led

		if ((p1.y <= this.y+40 ) &&  p1.x<(this.x+40)  ) { // om platt träff vänd


			vy = -vy; // byter riktning
		}
		if (y < 0) {// kollar om vi slott i taket.

			vy = -vy;// byter riktning

		}

		if (x + 2 * radie > jp.getWidth()) { // höger

			vx = -vx;
		}
		if (x < 0) {// vänster

			vx = -vx;

		}

	}


	@Override
	public void paint(Graphics g) {

		g.setColor(c);// sätter färg
		g.fillOval(x, y, radie * 2, radie * 2);// ritar ut bollen (Xled, yled, dimater x , diamter y )


	}



}
