package practice;
import java.util.Scanner;

public class FactorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object
		Scanner in = new Scanner(System.in);
		
		// enter integer number here.
	    System.out.print("Enter the number : ");
	    int x = in.nextInt(); 
	    System.out.println("Number of factors of is : " +result(x));

	}
	
	// create function to find the factors of given number.
		public static int result(int num) 
		{	
			int ctr = 0;
//			for(int i=1; i<=(int)Math.sqrt(num); i++)
//		    {
//		        if(num%i==0 && i*i!=num)
//		        {
//		            ctr+=2;
//		            System.out.println("+2"+i);
//		        } 
//		        else if (i*i==num) 
//		        {
//		            ctr++;
//		            System.out.println("+1"+i);
//		        }
//		    }
			
			for(int i=1; i<=num; i++)
			{
				if(num%i==0) {
					ctr++;
				}
			}
		        return ctr;
		}

}
