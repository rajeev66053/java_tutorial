package VariableLengthArguments;

public class index {
	public static void main(String[] args) {
		System.out.println(average(43,56,76,8,65,76,2,31));
	}
	/*Don't know how many arguments, put 3 dots and variable name */
	public static int average(int ...numbers) {
		int total=0;
		for(int x:numbers) {
			total+=x;
		}
		
		return total/numbers.length;
		
	}

}
