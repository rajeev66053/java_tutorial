package ClassToHoldObject;

public class AnimalList {
	private Animal[] thelist=new Animal[5];
	private int i=0;
	
	public void add(Animal a) {
		if(i< thelist.length) {
			thelist[i]=a;
			System.out.println("Animal addded at index "+i);
			i++;
		}
	}

}
