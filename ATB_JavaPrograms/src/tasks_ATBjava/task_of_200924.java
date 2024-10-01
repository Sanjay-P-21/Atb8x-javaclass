package tasks_ATBjava;

public class task_of_200924 {

	public static void main(String[] args) {
		//  By using Ternary Operators max between 3 numbers.

		// Input int - a,b,c - a = 10, b = 20, c = 45 

		// Max -> a,b,c -> c
		
		short a = 10;
		short b = 30;
		short c = 20;
		short d = 25;
		
		//short max = (a>b) ? ((a>c) ? a:c) : ((b>c) ? b:c);
		
		short max = (a>b) ? ((a>c)? ((a>d) ? a:d) : ((c>d) ? c:d)) : ((b>c) ? ((b>d) ? b:d) : ((c>d) ? c:d));
		
		System.out.println(max);

		
		


	}

}
