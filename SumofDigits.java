package week1.day1;

public class SumofDigits {

	public static void main(String[] args) {
		// sum of digits 1330
		
		int input = 1330;
			
		int sum = 0;
		
		while(input>0)
			
		{
			int rem = input % 10;
			
			sum = sum + rem;
			
				input = input / 10;
		}
		
		System.out.println(sum);

	}

}
