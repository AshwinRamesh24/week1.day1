package week1.day1;

public class Calculator {
	
	public int getAdd(int a, int b) 
	{
		return  a + b;
		

	}
	
	public double getSub(double a, double b) 
	{
		
return a - b;

	}
	
	public double getMultiply(double c, double d) 
	{

return c*d;

	}

	public int getDivide(int c, int d) 
	{
		return c / d ;

	}
	public static void main(String[] args) 
	{
		Calculator cd = new Calculator();
		int add = cd.getAdd(12, 13);
		System.out.println(add);
		double sub = cd.getSub(12.00, 16.00);
		System.out.println(sub);
		double multiply = cd.getMultiply(10, 10);
		System.out.println(multiply);
		int divide = cd.getDivide(10, 5);
		System.out.println(divide);
		

		
	}

}
