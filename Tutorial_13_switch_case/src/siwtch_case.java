import java.util.Scanner;

public class siwtch_case {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("enter 1 or 2");
		int Value = Input.nextInt(); 
		// can use string for cases but when be ("value")
		switch (Value) {
		case 1:
			System.out.println("you are in the matrix");
			break;// break to jump out of case
			
		case 2:
			System.out.println("you took the blue pill and pussyed out.");
			break;
			
		default:
			System.out.println("you flopped it!");
		}
	}
}
// CASE are like mutiple if else if else - looking for a match