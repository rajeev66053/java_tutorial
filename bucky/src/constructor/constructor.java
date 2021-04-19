package constructor;

public class constructor {
	private String girlName;
	
	/*constructor name must be same as class*/
	public constructor(String name) {
		girlName=name;
	}
	public void setName(String name) {
		girlName=name;
		
	}
	
	public String getName() {
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your first gf was %s\n", getName());
	}
}
