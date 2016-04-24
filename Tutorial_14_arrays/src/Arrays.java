
public class Arrays {

	public static void main(String[] args) {
		// assigning reference 'value' with memory for the integer 7
		int value = 7;
		
		// declaring the array reference 'values'
		int[] values;
		// assigning (with the new keyword) the reference with memory (size of the array)
		values = new int[3];
		
		//by default arrays are assigned value 0 seen below
		System.out.println(values[0]);
		
		//assigning values to the array elements
		values[0] = 1;
		values[1] = 2;
		values[2] = 3;
		
		//printing the elements of the array
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values.length);

		for (int i=0; i < values.length; i++){
			System.out.println(values[i]);
		//for loop to tap into each element in array
		//.length lets the for loop go till the length of the array
		//values.length = 3 as array size is 3 elements
		}
		
		//can declare array reference and assign memory and values in one line
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(numbers[2]); 
	}

}
