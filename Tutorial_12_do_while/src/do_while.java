import java.util.Scanner;

public class do_while {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int UserInput = 0;

		/*
		 * while (0 > UserInput || UserInput > 10) { System.out.println(
		 * "You have entered number outside the range try again \n"); UserInput
		 * = input.nextInt(); } for (int z = 0; z <= UserInput; z++) {
		 * System.out.printf(
		 * "the number you selected links to the number of times this statement prints %d %d \n"
		 * , z, UserInput); }
		 */ // THIS ABOVE IS A LONG WAY OF DOING A WHILE .. DO see below !>>

		do {
			System.out.println("enter a number between 1-9: ");
			UserInput = input.nextInt();
		} while (0 > UserInput || UserInput > 10); // WHILE NEEDS A SEMICOLON HERE TO WORK IN A DO WHILE !!!!
		// WHILE HAS NO CURLY BRACKETS AS IT IS IN REFERENCE TO STATEMENT ABOVE NOT BELOW .. BELOW IS JUST NEW COMMANDS TO DO !!!
		System.out.println("number in range good ! ");
		for (int z = 0; z <= UserInput; z++) {
			System.out.printf("the number you selected links to the number of times this statement prints %d %d \n", z,
					UserInput);

		}

	}
}
