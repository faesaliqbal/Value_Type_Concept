package package1;

public class MyClass {

	public static void main(String[] args) {
		
		/*Value Types
		 * 
		 * Value types are the basic types, and include following:
		 * 1. byte
		 * 2. short
		 * 3. int
		 * 4. long
		 * 5. float
		 * 6. double
		 * 7. boolean
		 * 8. char
		 * 
		 * PLEASE NOTE THAT Strings ARE NOT VALUE TYPE, THESE ARE REFERENCE TYPE
		 * 
		 * These data types store the values assigned to them in the corresponding memory locations.
		 * SO, WHEN YOU PASS THEM TO A METHOD, YOU BASICALLY OPERATE ON THE VARIABLE'S VALUE, RATHER THAN THE VARIABLE ITSELF.
		 */
		
		int x = 5;
		addOneTo(x);
		
		System.out.println(x);
		/*
		 * The value of x is still 5
		 * because addOneTo() method operated just on the value of x variable, not on the variable itself.
		 * original value of x variable will not be affected and 5 remains its value
		 */
	}
	
	static void addOneTo(int num){
		num = num + 1;
	}

}
