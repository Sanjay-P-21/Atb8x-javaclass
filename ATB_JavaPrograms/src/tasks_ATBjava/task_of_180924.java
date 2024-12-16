package tasks_ATBjava;

public class task_of_180924 {

	public static void main(String[] args) {
		// Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit. 
		//EX for explicit widening
		byte a1 = 90;
		byte b1 = 90;
		int aa =(a1 +b1);
		 System.out.println(aa);
		 
		 System.out.println("  ");
		 
		//EX for implicit widening
		 byte a11 = 90;
			short b12 = 90;
			int aa1 = 86;
			 System.out.println(aa1);
			 System.out.println(b12);
			 System.out.println(a11);
			 
			 System.out.println("  ");
			 
			//EX for implicit narrowing	 
			 //Ans: In Java, implicit narrowing is not possible. Narrowing conversions, where a larger data type is converted to a smaller data type (e.g., from int to byte),
			 //require explicit casting because there's a risk of data loss.
			//EX for explicit narrowing	  
			int q1 = 9000;
			byte qq = (byte) q1;
			System.out.println(qq);
			
			System.out.println("  ");
			 

int c = 10; 
System.out.println(  --c + c --  + c--); //9+9+9=27
System.out.println(c);//-1+-1+-1=-3

System.out.println("  ");

int b = 10; 
System.out.println(  --b + b++ + b--); //9+9+10=28
System.out.println(b);//-1++1+-1=-1

System.out.println("  ");

int a = 10; 
System.out.println(  a-- + a --  + a --); //10+9+8=27
System.out.println(a);//-1+-1+-1=-3
	}

}
