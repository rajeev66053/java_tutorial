package practice;
import java.util.Scanner;

public class FactorTwoCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object
		Scanner in = new Scanner(System.in);
		
		// enter integer number here.
	    System.out.print("Enter the number : ");
	    int x = in.nextInt(); 
	    System.out.println("FactorTwoCount  is : " +factorTwoCount(x));

	}
	
	// create function to find the factors of given number.
		public static int factorTwoCount(int num) 
		{			
			int count=0;
			while(num%2==0) {
				System.out.printf("%s", num);
				System.out.println();
				num=num/2;
				
				count++;		
			}
			
			return count;
		}

}
