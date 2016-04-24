class car {
	
	//method now has parameters passed to it in the brackets, each one separated via a comma
	void make(String brand, double EngSize) {
		System.out.println(brand + " engine size is : " + EngSize);
	}// brand and EngSize are placeholders used in the printing - in the method
	
	void Test(String test){
		System.out.println(test);
	}
}


public class method_parameters {
	
	public static void main(String[] args) {
		
		car VW = new car(); // making VW object of car class
		
		// calling the method in car class and passing arguments to it !!
		VW.make("VolksWagan", 1.2);
		
		//can this make new variables and then call upon the method !
		String Merc = "BENZ";
		VW.Test(Merc);
	}
}
