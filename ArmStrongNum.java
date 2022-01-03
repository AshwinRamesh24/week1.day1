package week1.day1;

public class ArmStrongNum {

	public static void main(String[] args) {
		// find whether 216 is Armstrong number
int input = 153;

int originalNum = input;

int sum = 0;

while(input>0)
{
	int rem = input % 10;
	sum = sum + (rem*rem*rem);
	input = input / 10;
	
}

if(sum == originalNum) 
{
	System.out.println("Given number is armstrong number");
}

else
{
	System.out.println("Given number is not armstrong number");
}
	
	}

}
