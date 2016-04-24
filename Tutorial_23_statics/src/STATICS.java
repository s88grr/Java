/*static used as it is only created once.
new objects created won't have their own static variable
have to class variable (in theory)  normal statics refered to as private or protected
one use is to create your own constants !! is this example thing.CON is the one created
can be used to count number of objects*/
class thing {
	//constant assigned below. the word final ensures it can't be changed.
	public final static int CON = 8;
	
	public static int count = 0; //counter variable initised to zero.
	public int ID = 0;
	public thing(){ //constructor to increment count when new object called.
		
		count++;
		ID = count;

	}
	
	public String name;
	public static String description;
	
	// can access instances and statics variables 
	public void showName(){
		System.out.println(name +"  :  "+ ID);
	}
	//below can only access static parameters NOT intances ones
	public static void showDescription(){
		System.out.println(description);
	}
}

public class STATICS {

	public static void main(String[] args) {
		System.out.println(thing.count+" before objects");
		thing thing1 = new thing();
		thing thing2 = new thing();
		System.out.println(thing.count+" after objects");

		//calling the class, NOT objects (thing1/2)
		thing.description = "BOOM";
		
		thing1.name = "SAAG";
		thing2.name = "P";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(thing.CON);
	}
}
