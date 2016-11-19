package model;

import java.awt.Point;
import java.util.Observable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import controller.RandModeThread;
import controller.RunningThread;

public class Horse extends Observable{
	private RunningThread runningThread;

	private RandModeThread randModeThread;

	private JLabel graphic;
	private SpeedMode speedMode;
	private final int WIDTH=80;
	private final int HEIGHT=80;
	private int meter;
	
	public Horse(){
		this.meter=0;
		graphic=new JLabel();
		graphic.setSize(WIDTH,HEIGHT);
		speedMode=new DefaultSpeedMode();
	
	}

	public void setIcon(ImageIcon icon) {
		graphic.setIcon(icon);
	}
	
	public JLabel getGraphic(){
		return graphic;
	}
	
	public void setLocation(int x, int y){
		graphic.setLocation(x,y);
	}
	
	public Point getLocation(){
		return graphic.getLocation();
	}

	public SpeedMode getRunningMode() {
		return speedMode;
	}

	public void setRunningMode(SpeedMode runningMode) {
		this.speedMode = runningMode;
	}
	
	public int getMeter() {
		return meter;
	}

	public void setMeter(int meter) {
		this.meter=meter;
		this.setChanged();
		this.notifyObservers();
	}
	
	public int getSpeed(){
		return speedMode.getSpeed();
	}

	public void run(){
		runningThread=new RunningThread(this);
		runningThread.start();
		randModeThread = new RandModeThread(this);
		randModeThread.start();
	}
	
	public void stop(){
		runningThread.interrupt();
		randModeThread.interrupt();
	}
}
