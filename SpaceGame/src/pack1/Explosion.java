package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Explosion {
	Timer exp;
	private int temp = 0;
	
	public Explosion() {
		exp =new Timer();
		exp.scheduleAtFixedRate (new TimerTask() {
			
			public void run() {
				
				if(Var.kollidiert) {
					Var.expanimation = temp;
					temp++;
				}else if(temp ==15) {
					Var.expanimation = 15;
					temp = 0;
					Var.kollidiert = false;
				}
			}
		}, 0, 50);
	}

}
