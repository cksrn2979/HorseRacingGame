package service;

import java.util.Iterator;
import java.util.LinkedList;

import model.Horse;

public class HorseRunners {
	private LinkedList<Horse> horses=new LinkedList<Horse>();
	private static final HorseRunners instance=new HorseRunners();
	
	public static HorseRunners getInstance(){
		return instance;
	}
	
	public void clear(){
		horses.clear();
		
	}
	public void add(Horse horse){
		horses.add(horse);
	}
	public int size(){
		return horses.size();
	}
	
	public Horse getHorse(int num){
		return horses.get(num);
	}
	
	public Iterator<Horse> iteraoter(){
		return horses.iterator();
	}
}
