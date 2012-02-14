package org.fazio.examples;

/**
 * This class contains some basic calculations.
 * The method will contain a few lines of code which do some sort of calculation, then return the result.
 * The main method will contain all the calculations being printed out using System.out.println(...), but
 *  these statements will be commented out to start.  Any of the lines can be
 *
 * @author Michael Fazio
 */
public class BasicCalculations {

	public BasicCalculations() {
		
		System.out.println(this.counterAndMod());

		System.out.println(this.floatConversion());

		System.out.println(this.intComparison());

		System.out.println(this.doubleCastToInt());

		System.out.println(this.mathRounding());
	}

	private int counterAndMod() {
		int counter = 17;
		
		counter++;
		counter = counter % 12;
		
		return counter;
	}
	
	private float floatConversion() {
		float aFloat = 16;
		int x = 0;
		
		x = (int) aFloat / 7;
		
		return x;
	}
	
	private boolean intComparison() {
		boolean bool = false;
		
		int x = 7;
		int y = 14 % 2;
		
		bool = (x > y);
		
		return bool;
	}
	
	private int doubleCastToInt() {
		int i = 0;
		
		double x = 3.24;
		double y = 3.97;
		
		i = (int)(x + y);
		
		return i;
	}
	
	private double mathRounding() {
		double x = 34.71;
		
		x = Math.round(x);

		return x;
	}
	
	public static void main(String[] args) {
		new BasicCalculations();
	}
}
