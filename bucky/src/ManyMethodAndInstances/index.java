package ManyMethodAndInstances;
import java.util.Scanner;

public class index {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		manyMethod manyMethodObject=new manyMethod();
		System.out.println("Enter name of first gf here:");
		String temp=input.nextLine();
		manyMethodObject.setName(temp);
		manyMethodObject.saying();
		
	}

}
