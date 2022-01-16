import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String firstName = "";
		String lastName = "";
		int age = 0;
		int birthMonth = 0;
		String favoriteColor = "";
		int siblings = 0;
		
		int retirementAge = 0;
		int bankBalance = 0;
		String vacationHome = "";
		String transportation = "";
		
		
		System.out.println("What is your first name?");
		firstName = input.nextLine().toLowerCase();
		firstName =	firstName.substring(0,1).toUpperCase() + firstName.substring(1);
		
		System.out.println("What is your last name?");
		lastName = input.nextLine().toLowerCase();
		lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
		
		System.out.println("How old are you?");
		age = input.nextInt();
		
		if (age % 2 == 0) {
			retirementAge = 67;
		} else {
			retirementAge = 99;
		}
		
		System.out.println("In what month were you born? In numerical format please.");
		birthMonth = input.nextInt();
		
		if (birthMonth > 0 && birthMonth < 4) {
			bankBalance = 400;
		} else if (birthMonth > 3 && birthMonth < 9) {
			bankBalance = 10000;
		} else if (birthMonth > 8 && birthMonth < 13) {
			bankBalance = 777;
		} else {
			bankBalance = 0;
		}
		
		System.out.println("What is your favorite color of the rainbow?\nType \"Help\" to show a list of colors");
		favoriteColor = input.next().toLowerCase();
		
				
		if (favoriteColor == "red") {
			transportation = "balloon";
		} else if (favoriteColor == "orange") {
			transportation = "stationwagon";
		} else if(favoriteColor == "yellow") {
			transportation = "giant peach";
		} else if(favoriteColor == "green") {
			transportation = "flying carpet";
		} else if(favoriteColor == "blue") {
			transportation = "submarine";
		} else if(favoriteColor == "indigo") {
			transportation = "osterich";
		} else if (favoriteColor == "violet") {
			transportation = "dinosaur";
		} else {
			transportation = "foot";
		}
		
		
		System.out.println("How many siblings do you have?");
		siblings = input.nextInt();
		
		if (siblings == 0) {
			vacationHome = "Wackyland";
		} else if (siblings == 1) {
			vacationHome = "Springfield";
		} else if (siblings == 2) {
			vacationHome = "Hyrule";
		} else if (siblings == 3) {
			vacationHome = "Nimbusland";
		} else {
			vacationHome = "a stranger's basement";
		}
		
		System.out.println(firstName + " " +lastName + " will retire at age " + retirementAge + 
				". With $" + bankBalance + " in the bank, a vacation home in " + vacationHome + " and travel by " + transportation + ".");
		
		input.close();
	}
}
