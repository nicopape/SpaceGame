package pack1;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Var {

	static JFrame jf1;
	static int screenwidth = 800, screenheight = 600;
	static int backgroundY1 = 0,backgroundY2 = -600, backgroundspeed = 9;
	static int x = 400, y=400;
	static int speedup = 3, speeddown = 2, speedleft = 2, speedright = 2;
	static int flammeanimation;
	static int victimx[] = new int[5], victimy[] = new int[5];
	static int victimspeed[] = new int[5];
	static int collectx1[]=new int[5], collecty1[]=new int[5];
	static int collectx2[]=new int[5], collecty2[]=new int[5];
	static int live = 3, maxlive = 3;
	static int expanimation;
	
	static JButton btnresume, btnshop, btnoption, btnexit;
	static JButton btnmute;
	
	static boolean moveup=false,movedown=false,moveleft=false,moveright=false;
	static boolean kollidiert = false, gameover = false;
	static Label lbl1;
	
	// bAckground
	static BufferedImage ib1, ib2;
	
	//Rackete und Flamme
	static BufferedImage irakete, iflamme1, iflamme2;
	
	//Victim
	static BufferedImage ivictim1;
	
	//Explosion
	static BufferedImage iexplosion[] = new BufferedImage[15];
	
	public Var() {
		
		try {
			//Background
			ib1 = ImageIO.read(new File ("rcs/b1.png"));
			ib2 = ImageIO.read(new File ("rcs/b2.png"));
			//Rackete
			irakete = ImageIO.read(new File ("rcs/ir1.png"));
			iflamme1 = ImageIO.read(new File ("rcs/flamme1.png"));
			iflamme2 = ImageIO.read(new File("rcs/flamme2.png"));
			ivictim1 = ImageIO.read(new File("rcs/Victim1.png"));
			//Explosion
			for(int i=0;i<10; i++) {
			iexplosion [i] = ImageIO.read(new File("rcs/Exp"+(i+1)+".png"));
			}
			
			
			}catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Es wurde kein Bild gefunden!");
			
		}
		
		victimspeed[0] = 3;
		victimspeed[1] = 4;
		victimspeed[2] = 3;
		victimspeed[3] = 4;
		victimspeed[4] = 3;
		
		
		
	}

}
