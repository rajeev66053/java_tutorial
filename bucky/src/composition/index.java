package composition;

public class index {
	public static void main(String[] args) {
		potpie potObject=new potpie(4,5,6);
		tuna tunaObject= new tuna("Gerg",potObject);
		
		System.out.println(tunaObject);
	}

}
