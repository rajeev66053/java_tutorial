
import java.util.Scanner;
public class scanner {
	public static void main(String args[]) {
		Scanner bucky= new Scanner(System.in);
		double fnum,snum,answer;
		System.out.print("Enter first num: ");
		fnum=bucky.nextDouble();

		System.out.print("Enter second num: ");
		snum=bucky.nextDouble();
		
		answer=fnum + snum;
		

		System.out.print("Total: ");
		System.out.println(answer);
		/*type in below terminal and enter to get output*/
	}
}
