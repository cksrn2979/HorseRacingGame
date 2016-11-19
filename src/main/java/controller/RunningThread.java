package controller;

import model.Horse;

public class RunningThread extends Thread{
	private Horse horse;

	public RunningThread(Horse horse){
		this.horse=horse;
	}
	
	public void run() {
		int location = horse.getMeter();
		int speed;		
		while(GameLogic.getInsatnce().getPlay()){
			location=horse.getMeter();
			speed=horse.getSpeed();
			horse.setMeter(location+speed);
			
			if(location>=800)
				GameLogic.getInsatnce().gameover(horse);
			
			try{
				Thread.sleep(100);
			}catch (Exception e) {
				return;
			}	
		}
		
	}

}
