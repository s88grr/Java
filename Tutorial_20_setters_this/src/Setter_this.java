class Pet {
	// private means can't access variables directly but can via methods in class
	private String name;
	private int age;
	
	String getName() {
		return name;
	}
	//just returning variable when method called
	int getAge(){
		return age;
	}
	//bit more advanced - takes method argument and sets it to name - SETTING THE PARAMETER
	void setName(String setname){
		name = setname;
	}
	
	void setAge (int age){ //notice placeholder is same as global variable name age
		//age = age; //means local variable = local varible ... useless really
		this.age = age; //this. means global so now its class age = local age useful !  
		//useful for naming the placeholders 
	}
}
public class Setter_this {

	public static void main(String[] args) {

		Pet dog = new Pet();
		//pervious way of accessing class variables PRIVATE class varibles means cant access them directly and below lines show error
		//dog.name = "beast";
		//dog.age = 2;
		
		//using new SETTER method to set variable passing method BEAST_SETTER this is a form of encapulation
		dog.setName("BEAST_SETTER");
		dog.setAge(88);		
		System.out.println(dog.getName()+ "\t" + dog.getAge());
	}

}