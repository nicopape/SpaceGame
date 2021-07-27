package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {
	private static final long serialVersionUID = 1L;
	protected void paintComponent (Graphics g) {
		
		super.paintComponent (g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//Background
		g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
		g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);
		
		
		
		
		//Victim
		for(int i = 0;i<4;i++) {
			
			g.drawImage(Var.ivictim1, Var.victimx[i], Var.victimy[i], 80, 60, null );
		}
		//Flamme
		if(Var.flammeanimation == 0) {
			g.drawImage(Var.iflamme1, Var.x, Var.y+58, 50, 50, null);
		}else if(Var.flammeanimation == 1) {
			g.drawImage(Var.iflamme2, Var.x, Var.y+58, 50, 50, null);
		}
		
		
		
		//Rackete
		g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);
		
		
		//Explosion
		if(Var.kollidiert) {
			
			for(int i=0;i<15;i++) {
				if(Var.expanimation==i) {
				g.drawImage(Var.iexplosion [i], Var.x-10, Var.y-10, 73, 100, null);
			}
		}
		}
		
			if(Var.expanimation>1&&Var.expanimation<=3) {
				g.setColor(new Color(230,0,0,45));
				g.fillRect(0,  0,  Var.screenwidth, Var.screenheight);
			}else if (Var.expanimation>=5&&Var.expanimation<=7) {
				g.setColor(new Color(230,0,0,45));
				g.fillRect(0,  0,  Var.screenwidth, Var.screenheight);
			}
		
		// Game Over Animation
		
				if (Var.gameover) {
					g.setColor(new Color(0,230,115));
					g.setFont(new Font("Arial",Font.BOLD,35));
					g.drawString("Leben:"+Var.live, 30,30);
					repaint();			
				}else {
					g.setColor(new Color(0,230,115));
					g.setFont(new Font("Arial",Font.BOLD,35));
					g.drawString("Leben:"+Var.live, 30,30);
					repaint();
				}
		
		repaint();
	}

}
