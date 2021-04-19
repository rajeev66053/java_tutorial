package AbstractAndConcreteClasses;

public class fatty {
	
	//food fo=new food(); /*can't create as food is abstract class*/
	food fo =new tuna();/*can be create as it is concrete class*/
	
	public void digest(food x) {
		x.eat();
	}

}
