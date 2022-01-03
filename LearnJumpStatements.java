package week1.day1;

import org.apache.poi.util.SystemOutLogger;

public class LearnJumpStatements {

	public static void main(String[] args) {
		//print 5 as 'five'
		
		for(int i=1; i<=5; i++)
		{
			if(i==5)
			{
				System.out.println("Five");
				continue;
			}
			
			System.out.println(i);
		}

	}

}
