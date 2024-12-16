package tasks_ATBjava;

public class task_of_250924_02 {

	public static void main(String[] args) {
		//Prime Number from 1 to 100. (for loop)
		
		for (int a = 2; a <= 100; a++) {
			boolean isPrime = true;
			
			for(int b = 2; b <= Math.sqrt(a); b++) {
				if (a % b == 0) {
					isPrime = false;
				break;
				}
			}
			
			if (isPrime) {
				System.out.println(a);
			}
		}
		
	}
	
}	
