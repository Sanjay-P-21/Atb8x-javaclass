package ex_200924;

public class lab_071 {

	public static void main(String[] args) {
//		 boolean a = true;
//	        a = !a;
//	        if (2 + 2 < 4) {
//	            System.out.println("Inside the loop");
//	       } else {
//	    	   System.out.println("Outside -> " + a);
//	       }
		char grade = 'F';
        int score = 61; // in the future we will get this from the users. input


        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score >= 50 && score <= 59) {
            grade = 'E';
        } else if (score <= 0 || score > 100) {
            System.out.println("LOL!!, are you God?");
            grade = 'O';
        }    
        
          if (grade == 'A' || grade == 'B' || grade == 'C') {
        	System.out.println("Congrats You Scored -> " + grade + " Grade");
        } else if (grade == 'D' || grade == 'E') {
        	System.out.println("Oops!! You need To Try Again Bcz of -> " + grade + " Grade");
        }



    }
}