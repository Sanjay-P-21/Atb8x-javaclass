package ex_250924;

public class Lab_093 {

    public static void main(String[] args) {
        for (int a = 0; a <= 20; a++) {
            // Print names for specific values
            if (a == 2 || a==2*6) { 
                System.out.println("Prakash");
            } else if (a == 4) { 
                System.out.println("Lalitha");
            } else if (a == 6) {
                System.out.println("Sanjay");
            } else if (a == 8) { 
                System.out.println("Sony");
            } else if (a == 10) { 
                System.out.println("Mony");
            } else {
                // Print remaining values
                System.out.println(a);
            }
        } 
    }
}
