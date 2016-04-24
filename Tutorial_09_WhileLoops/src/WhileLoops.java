
public class WhileLoops {
	public static void main(String[] args) {

		int x = 0;
		while (x < 10)
		{
			System.out.println("test " + x);
			if (x == 5)
			{
				break; // break functions jumps out of loop jumps to the curly bracket } below while
			}
			x++;
		}// break jumps to next line and skips all the above
	}
}
/*While Loop notes
 * while to be followed by condition in brackets
 * ensure loop has condition to close not infinite
 * requires loop conditioning / initialising 
 * x++ is x=x+1
 * 
 * when break function condition met the program jumps out of loop !!! like an interupt !
 * 
 * */