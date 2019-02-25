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
 * @version 2.0
 */

public class Calculator {

	private int total;

	public Calculator () {
		total = 0;  
	}

	public int getTotal () {
		return total;
	}

	public void add (int value) {
		total = total + value;
	}

	public void subtract (int value) {
		total = total - value;

	}

	public void multiply (int value) {
		total = total * value;

	}

	public void divide (int value) {

		if(value == 0) {

			total = 0;

		}else {

			total = total / value;
		}

	}

	public String getHistory () {


		return "";
	}
}
