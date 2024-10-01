package ex_180924;

public class lab_052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // GST = 18.45;
        int course = 100;
        float GST = 18.45f;
          //int total_price = course+GST; // Narrowing - Implicit - JVM - Invalid
        //float total_price = course+GST; // Widening - Implicit - JVM - Invalid


        float total_price = course+GST; // Narrowing - Explicit - LOSS
        System.out.println(total_price);

	}

}
