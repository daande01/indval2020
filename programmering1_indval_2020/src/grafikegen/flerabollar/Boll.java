package grafikegen.flerabollar;

import java.awt.Color;
import java.awt.Graphics;

public class Boll {



	private int x;
	private int y;
	private int xv;
	private int yv;
	private Color c;
	private int r;

	public Boll(int xx , int yy, int xvxv, int yvyv, Color cc, int rr ) {

		this.x=xx;
		this.y=yy;
		this.xv=xvxv;
		this.yv=yvyv;
		this.c=cc;
		this.r=rr;


	}

	public void rita(Graphics g) {

		g.setColor(c);
		g.fillOval(x, y, r*2, r*2);


	}

	public void update() {

		x++;
		y++;

	}





}
