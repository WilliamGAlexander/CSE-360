package cse360assign2;
/*
 * William Alexander
 * Class ID: 310
 * Assignment 2
 */


/**
 * The Calculator class performs addition, subtraction, multiplication,
 * and division. There is a method to return the current value and another
 * method that prints the history of previous calculations
 * @author William Alexander
 * @version 3.0
 */

public class Calculator {

	private int total;
	private String history = " ";
	
	public Calculator () {
		total = 0;
		//0 is the first term to print
		history = "0";
	}

	public int getTotal () {
		return total;
	}

	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}

	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}

	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}

	public void divide (int value) {

		if(value == 0) {

			total = 0;

		}else {

			total = total / value;
		}
		
		history = history + " / " + value;
	}

	public String getHistory () {


		return history;
	}
}
