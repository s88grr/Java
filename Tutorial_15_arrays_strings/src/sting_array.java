
public class sting_array {

	public static void main(String[] args) {

		// declaring array of strings 
		String[] words = new String[3];
		
		//assigning string to each array element
		words[0] = "man";
		words[1] = "you";
		words[2] = "lost";
		
		//printing out particular element 
		System.out.println(words[2]);

		// declaring a string array & assigning value 
		String[] cars = {"VW", "porshe", "benz"};
		
		//car is the variable for each array element its a placeholder for each element
		for(String car: cars){
			System.out.println(car);
		}
		
		//default value of an empty array is null, basically nothing...
		String text = null;
		
		//printing nothing!
		System.out.println(text);
		
		//declaring new array !
		String[] texts = new String[2];
		//again default array value printing null
		System.out.println(texts[0]);
		//assigned element manually! 
		texts[0] = "one";
	}

}
