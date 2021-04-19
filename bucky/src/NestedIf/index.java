package NestedIf;

public class index {
	public static void main(String[] args) {
		int age=60;
		
		if(age==60) {
			System.out.println("You are good.");
		}		
		else if(age < 50) {
			System.out.println("You are pretty young.");			
		}else {
			System.out.println("You are old.");
			if(age > 75) {
				System.out.println("You are really old.");
			}else {
				System.out.println("Don't worry.");
			}
		}
		
	}

}
