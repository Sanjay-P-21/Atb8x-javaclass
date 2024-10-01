package tasks_ATBjava;

public class task_of_250924_03 {

	public static void main(String[] args) {
		//Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120

        // n = 1 ->  Fact = 1*1 -> 1

        // n = 3 -> Fact = 3*2*1 -> 6 
		int n = 6;
		
		long factorial = 1;
		
		for (int i=1; i<=n;i++) {
			factorial *=i;}
				
			System.out.println(factorial);
			System.out.println(4*3*2*1);
		

	}

}
