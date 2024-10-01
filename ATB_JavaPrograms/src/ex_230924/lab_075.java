package ex_230924;

public class lab_075 {

	public static void main(String[] args) {
	     // Switch Condition
        // Days - 1 to 7 ->  1 mon, 2 - tue, 7 - sun...
		byte Days = 127;

		switch (Days) {

		case 1:
		System.out.println("Sun");
		break;

		case 2:
		System.out.println("Mon");
		break;

		case 3:
		System.out.println("Tue");
		break;

		case 4:
		System.out.println("Wed");
		break;
		
		case 5:
			System.out.println("Thu");
			break;
		
		case 6:
			System.out.println("Fri");
			break;
			
		case 7:
			System.out.println("Sat");
			break;

		default:
		System.out.println("Wrong Input");

		}
		
		System.out.println("End of the loop");



		}
		}
