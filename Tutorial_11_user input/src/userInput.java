import java.util.Scanner;

public class userInput 
{
	public static void main(String[] args) 
	{	
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		// output the prompt
		System.out.println("Enter line of text :");
		
		// wait for user to enter a line of text
		// String line = input.nextLine();
		// can change line above to accept numerical/decimals etc
	      int line = input.nextInt();
		
		//tell them what they entered
		System.out.println("you entered: " + line);
	}

}
