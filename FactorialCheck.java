package week1.day1;

public class FactorialCheck {

	public static void main(String[] args) {
		//find the factorial of 8
		
		int inp = 8;
		int fact = 1;
		for(int i=1; i<inp; i++)
		{
			fact = fact * i;
			
		}
		System.out.println(fact);
	}

}
