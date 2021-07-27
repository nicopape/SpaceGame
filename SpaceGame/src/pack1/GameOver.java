package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class GameOver {
	Timer gameover;
	private int temp = 0, temp1 = 0;

	public GameOver() {
		gameover = new Timer();
		gameover.scheduleAtFixedRate(new TimerTask() {
			
			public void run() {
				if(Var.gameover) {
					if(temp>=0 && temp<=55) {
						temp++;
					}else if(temp==56) {
						
						
						System.out.println("Game Over");
						
						//Victimsspawner
						
						for(int i=0;i<4;i++) {
							Var.victimy[i]=0;
							
						}
						
						for (int i = 0; i<=4; i++) {
							Var.victimy[i] = -100 - temp1;
							
							temp1 += 160;
							}
						
						Var.live = Var.maxlive;
						Var.gameover = false;
						}
				}
			}
			
		}, 0, 15);
		
	}

}
