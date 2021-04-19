import java.util.Scanner;
public class methodWithParameter {
	public static void main(String[] arg) {
		
		Scanner input=new Scanner(System.in);		
		methodWithParameters smObject=new methodWithParameters();
		
		System.out.println("Enter your name here:");
		String name=input.nextLine();
		
		smObject.simpleMessage(name);
		
	}

}
