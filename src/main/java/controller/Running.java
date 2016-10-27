package controller;

import model.Horse;

public class Running implements Runnable{
	private Horse horse;

	public Running(Horse horse){
		this.horse=horse;
	}
	
	public void run() {
		int location = horse.getMeter();
		int speed;
		
		while(location<800){
			location=horse.getMeter();
			speed=horse.getRunningMode().getSpeed();
			horse.setMeter(location+speed);
			
			if(location>=800)
				GameLogic.getInsatnce().gameover();
			
			try{
				Thread.sleep(100);
			}catch (Exception e) {
				return;
			}	
		}
		
	}

}
