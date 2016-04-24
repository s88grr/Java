
public class multidimension_array {

	public static void main(String[] args) {
		
		//1D array as its one set of square brackets
		int[] numbers = {1,2,3,6,7,8,9};
		System.out.println(numbers[5]);
		
		//2D array require two square brackets [][] - first is for row second for coloumns 
		int [][] number_grid = {
				{1,2,3,4},
				{4,5},
				{6},
				{7,8,9,10}
		};
/* Arrays can be any size - same size not required
 * each row must be in curly brackets followed by a comma 
 * semi-comma needed after final curly bracket
 */
		System.out.println(number_grid[2][0]);
		System.out.println(number_grid[3][3]);
		// usual printing function with 0 positioning for 1st value
		
		//similar process for strings see below
		String [][] words = new String [2][2];
		words [0][1] =  "BBQ Chicken";
		System.out.println(words [0][1]);
		
		//using a nested for loop to go round the grid array using example above:
		//number_grid.length = number of rows in array - so for loop cycles each row with this first for loop
		for (int row = 0; row < number_grid.length; row++){
			// 2nd for loop goes through each element of the row its on. number_grid[row].length cycles each element 
			for(int col = 0; col < number_grid[row].length; col++){
				System.out.print(number_grid[row][col] + " ");				
			}// PRINT over PRINTLN to each it on the same line !!!
			System.out.println(); // to put next row on new line
		}
		
		// The last array index is optional - can be left blank
        String[][] wordss = new String[2][];
        
        // Each sub-array is null = returns null
        System.out.println(wordss[0]);
        
        // We can create the subarrays 'manually'.
        wordss[0] = new String[3];
        
        // Can set a values in the sub-array we
        // just created.
        wordss[0][1] = "hi there";
        
        System.out.println(wordss[0][1]);
	}

}
