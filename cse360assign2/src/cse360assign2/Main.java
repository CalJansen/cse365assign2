package cse360assign2;

public class Main
{

	public static void main(String[] args)
	{
		Calculator myCalc = new Calculator();
		
		myCalc.add(3);
		myCalc.subtract(5);
		myCalc.multiply(4);
		myCalc.divide(3);
		System.out.println(myCalc.getTotal());
		System.out.println(myCalc.getHistory());

	}

}
