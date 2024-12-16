package ex_230924;

public class Lab_085 {

	public static void main(String[] args) {
		   int itemCode = 005; // JDK  >13

	        switch (itemCode) {
	            case 001 -> System.out.println("It's a laptop!");
	            case 002 -> System.out.println("It's a desktop!");
	            case 003, 004 -> System.out.println("It's a mobile phone!");
	            default -> System.out.println("Heloo!");
	        }
	}

}
