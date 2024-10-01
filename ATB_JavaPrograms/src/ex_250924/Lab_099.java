package ex_250924;

public class Lab_099 {

	public static void main(String[] args) {
		
		int value = 0;
		String output = ", ";
		String end = ".";
		 for (char c = 'A'; c <='Z';c++){
			  if (c == 'A') { System.out.print(c);
			  } else if (c != 'A')
	            System.out.print(output + c);
	            
	            value++;
	            
	      
		 }System.out.println(end);
		 System.out.println("Total Alphabets = " + value);
		
	} 

}


