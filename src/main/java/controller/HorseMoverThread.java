package controller;

import javax.swing.JPanel;

import service.HorseRunners;

public class HorseMoverThread implements Runnable{
	private JPanel racingpanel;
	private HorseRunners horses;
	
	public HorseMoverThread(){
		horses= HorseRunners.getInstance();
		racingpanel=(JPanel) horses.getHorse(0).getGraphic().getParent();
	}

	public void run() {
		while(true){
			racingpanel.repaint();
			try{
				Thread.sleep(100);
			}catch (Exception e) {
				return;
			}
		}
	}
	

}
