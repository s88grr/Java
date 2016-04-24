
public class Forloop 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("testloop" + i);
			System.out.printf("testloop %d", i);   // printf doesn't print new line
			System.out.printf("testloop %d\n", i); // the \n puts new line
// nice and easy 3 variations in writing/displaying the output !
		}
	}
}

/*
 * for loops notes
 * for loop is made by for () {} need brackets
 * for(initialise loop; condition to keep loop valid !! (end condition of loop); operation after each line (loop increment) 
 * 
 * can use printf over println
 * it don't print new line (\n)
 * it uses %d to refer the number in text !
 * boom !!!
 */