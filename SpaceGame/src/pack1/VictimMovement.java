package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class VictimMovement {
	Timer movement;
	private int temp = 0;
	
	public VictimMovement() {
		for(int i=0;i<=4;i++) {
			Var.victimx[i]=30+temp;
			Var.victimy[i]=30-temp;
			
			temp += 160;
		}
		
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask(){
			
			public void run() {
				
				for(int i=0;i<=4;i++) {
					Var.victimy[i]+=Var.victimspeed[i];
					if(Var.victimy[i]>=Var.screenheight) {
						Var.victimy[i] = -100;
					}
				}
		}	
		
	}, 0, 9);

	}
}
