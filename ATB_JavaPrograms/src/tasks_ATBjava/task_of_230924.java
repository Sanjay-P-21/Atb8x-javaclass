package tasks_ATBjava;

public class task_of_230924 {

	public static void main(String[] args) {
		// Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.

//Inputs :   num 1, num 2, +
//Output :  num1+num2 - print information.	
		int a = 20;
		int b = 30;
		
		String choice = "multi";
		
		switch (choice) {
		case "add":
		System.out.println(a+b);
		break;
		case "sub":
			System.out.println(a-b);
			break;
		case "multi":
			System.out.println(b*a);
			break;
		case "div":
			System.out.println(b/a);
			break;
		case"mod":
			System.out.println(b%a);
			break;
		default:
			System.out.println("undefined");
		}
		

	}

}
