package tasks_ATBjava;

public class task_of_160924 {

	public static void main(String[] args) {
		// Difference between = and  ==?
		//Ans:- '=' is a assignment operator used to assign value to the variable.
		//Ans:- '==' is an equality operator which is used to compare two values for equality.
		
		//byte b = 10; long l = 10l; // How much Byte will be used?
		//Ans:- byte 'b' = 1 byte & long l = 8 bytes so 1+8 = 9 bytes.
		
		//Another byte b = 10; byte c = 10;  What is the anwser if the perform b+c, What is the data type it will give in result. 
        // Ans:- In Java, when you perform the operation b + c where both b and c are of type byte, the result of the addition will be promoted to an int.

        //Here’s why:
//
        //Byte Promotion: In arithmetic operations, Java promotes smaller integer types (like byte and short) to int to ensure there's no loss of data.
//		byte b = 10;
//		byte c = 10;
//		int result = b + c; // result will be 20, and its type will be int
		
		
		  short s = 10;

	        char c = 'A'; //65

	        int ss = s+c;

     System.out.println(ss);
		
		
		
	}

}
