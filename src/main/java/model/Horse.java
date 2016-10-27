package model;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import controller.Running;

public class Horse{
	private JLabel graphic;
	private Thread running;
	private SpeedMode runningMode;
	private final int WIDTH=80;
	private final int HEIGHT=80;
	private int meter;
	
	public Horse(){
		this.meter=0;
		graphic=new JLabel();
		graphic.setSize(WIDTH,HEIGHT);
		runningMode=new DefaultSpeedMode();
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

	public SpeedMode getRunningMode() {
		return runningMode;
	}

	public void setRunningMode(SpeedMode runningMode) {
		this.runningMode = runningMode;
	}
	
	public int getMeter() {
		return meter;
	}

	public void setMeter(int meter) {
		this.meter=meter;
	}

	public void run(){
		running=new Thread(new Running(this));
		running.start();
	}
	
	public void stop(){
		running.interrupt();
	}
}
