package tasks_ATBjava;

public class task_of_250924_04 {

	public static void main(String[] args) {
		// TO print the vowels in the alphabet using for loop//
		
		String vowels = "AEIOUaeiou";
		
		char ch = 'A';
		
		char ch1 = 'Z';
		
		while (ch-1<=ch1) {
			
			if (vowels.indexOf(ch) != -1) {
				System.out.println(ch);
			}
			ch++;
		}
		
	
		
		
	}

}
