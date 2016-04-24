/* 
 * Simple program by Saag 05/03/16 it will:
 * take user input in form of number 1-9 with validation (while loop validation)
 * loop a message with the number as a increment end condition (for) 
 * another loop (while) displaying another message - 
 */
import java.util.Scanner;

public class recap_sp_far 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number between 1-9: ");
		int UserInput = input.nextInt();
		
		if (0 < UserInput && UserInput < 10)
		{
			for (int z = 0; z <= UserInput; z++)
			{
				System.out.printf("the number you selected links to the number of times this statement prints %d %d \n", z, UserInput);
			}
		}
		else 
		{
			System.out.println("You have entered number outside the range try again");
		}
	}

}
