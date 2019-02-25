package cse360assign2;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		c.add(5);
		c.multiply(2);
		c.subtract(2);
		c.divide(2);
		System.out.println(c.getTotal());
		//System.out.println(c.getTotal());
	}

}
