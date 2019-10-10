//Author: Jordan Bryant
//Class ID: CSE 360 Wednesday, Class # 70642
//Assignment # 2
//Description: This class adds and subtracts numbers


package cse360assign2;

public class AddingMachine {
	private int total;
	private String history = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		history = history + " + " + value;
	}
	
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;
	}
		
	public String toString () {
		return history;
	}

	public void clear() {
		total = 0;
		history = "0";
	}
}


