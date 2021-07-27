package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class VictimKollision {
	Timer kollision;
	private int temp = 0;
	public VictimKollision() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {
			
			public void run() {
				
				for(int i=0;i<4;i++) {
					if(temp==0) {
						if(Var.x>=Var.victimx[i]-50&&Var.x<=Var.victimx[i]+73&&
							Var.y>=Var.victimy[i]-70&&Var.y<=Var.victimy[i]+35) {
							
							Var.kollidiert = true;
							Var.victimy[i]=100;
							
							if(Var.live>=1) {
								Var.live-=1;
							}
							if(Var.live==0) {
								Var.gameover = true;
							}
							if(Var.live>0) {
								Var.gameover = false;
							}
							
							temp ++;
						}
					}
				}
				
				if(temp>=1&&temp<=65) {
					temp++;
				}else if(temp==66) {
					temp =0;
				}
			}
			
		}, 0, 15);
	}

}
