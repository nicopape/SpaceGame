package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Background {
	Timer back;

	public Background() {
		back= new Timer();
		back.scheduleAtFixedRate(new TimerTask() {	
			
			@Override
			public void run() {
				
				// Background lauf im Bild
				if(Var.backgroundY1<587){
					Var.backgroundY1 +=3;
				} else {
					Var.backgroundY1 = -597;
				}
				
				if(Var.backgroundY2<587){
					Var.backgroundY2 +=3;
				} else {
					Var.backgroundY2 = -597;
				}
				
			}
		}, 0, Var.backgroundspeed);
	}

}
