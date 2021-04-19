package Static;

public class bucky {
	private String first;
	private String last;
	private static int members=0;
	
	public bucky(String fn, String ln) {
		first=fn;
		last=ln;
		members++;
		System.out.printf("constructor for %s %s ,members in the club: %d\n",first,last,members);
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	public static int getMember() {
		return members;
	}

}
