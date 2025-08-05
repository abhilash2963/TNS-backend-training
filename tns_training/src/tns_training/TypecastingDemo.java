package tns_training;

public class TypecastingDemo {

	public static void main(String[] args) {
		//Implicit Type Casting (Widening Conversion)
		 int intValue = 10;
	        double doubleValue = intValue; // Implicit casting from int to double
	        System.out.println("Integer value: " + intValue);
	        System.out.println("Double value: " + doubleValue);
	        
	        //Explicit type casting
	        double doubleValue1 = 10.75;
	        int intValue1 = (int) doubleValue1; // Explicit casting from double to int
	        System.out.println("Double value: " + doubleValue1);
	        System.out.println("Integer value: " + intValue1); // Output: 10 (decimal part truncated)
	    
	

	}

}
