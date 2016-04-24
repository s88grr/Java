// constructors are called when new objects are created ... used to intialise !

class carID {

	private String condition;
	private int age;
	private String colour;

	// By default this method is going to called as its passed nothing !

	public carID() {

		// when calling other constructors, line must be first in current
		// constructor

		this("RED", 1, "NEW");
		condition = "NEW";
		age = 0;
		System.out.println("contrustor 1 running");

	}

	// This constructor will be called when an int is passed to it

	public carID(int age) {

		this("BLUE", age, "DIMPLE");

		// line below uses what was learnt in the exercise before
		this.age = age; // global V = local V
		System.out.println("contrustor 2 running");

	}

	public carID(String colour, int age) {

		// can pass the parameters to the this function !!
		this(colour, age, "DLE");
		System.out.println("contrustor 3 running");

	}

	/*
	 * can use constuctor within itself by passing variables using this.
	 * 
	 * system will automatically match which constructor to use EG see below
	 * 
	 */

	public carID(String colour, int age, String condition) {

		this.colour = colour;
		this.age = age;
		this.condition = condition;
		System.out.println("4th one running !!!");

	}

}

public class constructors {

	public static void main(String[] args) {
		// the new carID(); calls upon the constructor
		carID car1 = new carID();
		// calling the 2nd constructor !
		carID car2 = new carID(2);
		// calling 3rd one
		carID car3 = new carID("red", 8);
	}

}
