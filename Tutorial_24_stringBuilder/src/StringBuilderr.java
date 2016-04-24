
public class StringBuilderr {

	public static void main(String[] args) {

		String test = "";
		
		//inefficient method of creating a string builder
		//this method creates a string, the creates another, and then a third
		test += "Saag";
		test += " ";
		test += "the boss";
		
		System.out.println(test);
		
		//efficient method via built in function (libaray)
		StringBuilder sb = new StringBuilder("");
		
		//append function adds to the current string, - more efficient on memory.
		sb.append("saagar");
		sb.append("  ");
		sb.append("the best");
		System.out.println(sb.toString());
		
		//can you method chaining:
		StringBuilder s = new StringBuilder("");
		s.append("methond chaining")
		.append(" cool can add")
		.append(" like this");
		System.out.println(s.toString());
		
		//_____________FORMATTING_______________________
		//using print only
		System.out.print("qwertyuiop \t tab wertyuiop \n new line");
		
		//formatting integers using printf (print format) using a number between the % and integer specifier = width (the - is an alignment to left)
		System.out.printf("qwertyuiop %-10d qwertyuiop %15d\n", 5, 9);
		
		//formatting floating print value
		//the .2 specifics the number of decimal places
		System.out.printf("qwertyuiop %.2f\n", 1.12345678);
		//the 6 is the width as mentioned before
		System.out.printf("qwertyuiop %6.2f\n", 1.12345678);

	}
}
