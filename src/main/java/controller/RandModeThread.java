package controller;

import java.util.ArrayList;
import java.util.LinkedList;

import model.CrazySpeedMode;
import model.DefaultSpeedMode;
import model.DyingSpeedMode;
import model.HighSpeedMode;
import model.Horse;
import model.SpeedMode;

public class RandModeThread extends Thread{
	private ArrayList<SpeedMode> modes;
	private Horse horse;
	
	public RandModeThread(Horse horse){
		this.horse=horse;
		modes=new ArrayList<SpeedMode>();
		modes.add(new CrazySpeedMode());
		modes.add(new HighSpeedMode());
		modes.add(new DefaultSpeedMode());
		modes.add(new DyingSpeedMode());
		
	}

	public void run() {
		while(GameLogic.getInsatnce().getPlay()){
			int random = (int) (Math.random() * 4);
			SpeedMode mode= modes.get(random);
			
			horse.setRunningMode(mode);
			
			try{
				Thread.sleep(1000);
			}catch (Exception e) {
				return ;
			}
			
		}
	}

}
