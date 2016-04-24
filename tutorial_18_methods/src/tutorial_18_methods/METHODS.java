package tutorial_18_methods;

class friend {
	// data/ instance variables 
	String name;
	String status;
	int age;
	
	void shoutOut(){
		System.out.println("Hey I'm " + name + ", and I'm Saagar's " + status + ". My age is " + age + ".");
	}
}
public class METHODS {
	
	public static void main(String[] args) {
		
		// dimple and nikhil are objects created here !!
		friend dimple = new friend();
		friend nikhil = new friend();
		
	// setting the object data :) 
	dimple.name = "Dimple";
	dimple.status = "GF";
	dimple.age = 27;
	nikhil.name = "Nikhil";
	nikhil.status = "homie";
	nikhil.age = 25;
	
	//running the methods of the class
	dimple.shoutOut();
	nikhil.shoutOut();

	}
}
