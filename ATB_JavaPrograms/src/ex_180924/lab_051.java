package ex_180924;

public class lab_051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 long phone_no = 911329403;
	        //short s = phone_no; // Narrowing - Implicit - JVM // Invalid
	        byte s1 = (byte)phone_no; // Narrowing - Explicit - Loss of data // Invalid
	        
	        System.out.println(s1);

	}

}
