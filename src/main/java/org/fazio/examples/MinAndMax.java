package org.fazio.examples;

/**
 * This class contains some random number statements.
 * For each one, there is a minimum value and a maximum value possible.
 * 
 * @author Michael Fazio
 */
public class MinAndMax {

	public MinAndMax() {

//		System.out.println(minMaxA());
//		System.out.println(minMaxB());
//		System.out.println(minMaxC());
//		System.out.println(minMaxD());

	}
	
	private int minMaxA() {
		int value = 0;
		
		value = (int)(Math.random() * 7);
		
		return value;
	}
	
	private int minMaxB() {
		int value = 0;
		
		value = (int)(Math.random() * 4 + 2);
		
		return value;
	}
	
	private int minMaxC() {
		int value = 0;
		
		value = (int)(Math.random() * 8) + 5;
		
		return value;
	}
	
	private int minMaxD() {
		int value = 0;
		
		value = (int)(Math.random() * 5) + (int)(Math.random() * 3);
		
		return value;
	}
	
	public static void main(String[] args) {
		new MinAndMax();
	}
}
