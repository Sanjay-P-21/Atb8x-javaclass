package tasks_ATBjava;

public class task_of_230924_03 {

	public static void main(String[] args) {
		//Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
		//Input. - 
		//choice - 1 - km - m, km - 1km
		//choice - 2 - f - c, f - c
		
		float mile = 2;
		String mile1 = "mile";
		
		float meter = 5;
		String meter1 = "meter";
		
		float celsius = 37.777777777f;
		String celsius1 = "fahrenheit";
		
		float fahrenheit = 100;
		String fahrenheit1 = "celsius";
		
		String type = "celsius1" ;
		
		switch (type) {
		
		case "mile1" -> System.out.println("The Value is in Miles = " + mile*1.6 + "M.");
		
		case "meter1" -> System.out.println("The Value is in Meters = " + meter*1000 + "m.");
		
		case "fahrenheit1" -> System.out.println("The Value is in Fahrenheit " + ((celsius*1.8)+32) + "'f.");
		
		case "celsius1" -> System.out.println("The Value is in Celsius " + ((fahrenheit - 32)*(0.556)) + "'C.");
		
		default -> System.out.println("Wrong Input");
		
		}

	}

}
