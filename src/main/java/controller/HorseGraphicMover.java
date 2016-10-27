package controller;

import java.awt.Point;
import java.util.Iterator;

import javax.swing.JPanel;

import model.Horse;
import service.HorseRunners;

public class HorseGraphicMover implements Runnable{
	private JPanel panel;
	private HorseRunners horses;
	
	public HorseGraphicMover(){
		horses= HorseRunners.getInstance();
		panel=(JPanel) horses.getHorse(0).getGraphic().getParent();
	}

	public void run() {
		while(true){
			Iterator<Horse> iter=horses.iteraoter();
			while(iter.hasNext()){
				Horse horse=iter.next();
				Point p=horse.getGraphic().getLocation();
				p.setLocation(horse.getMeter(),p.y);
				horse.getGraphic().setLocation(p);
			}
			
			panel.repaint();
			try{
				Thread.sleep(100);
			}catch (Exception e) {
				return;
			}
		}
	}
	
	public void startMove(){
		Thread th=new Thread(this);
		th.start();
	}

}
