import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String firstName = "";
		String lastName = "";
		int age = 0;
		int birthMonth = 0;
		String favoriteColor = "";
		int siblings = 0;
		
		System.out.println("What is you first name?");
		firstName = input.nextLine().trim().toLowerCase();
		firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
		
		System.out.println("What is you last name?");
		lastName = input.nextLine().trim().toLowerCase();
		lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
		
		System.out.println("How old are you?");
		age = input.nextInt();
		
		System.out.println("In what month were you born, as a number?");
		birthMonth = input.nextInt();
		
		System.out.println("What is you favorite color of the rainbow? If you need help type help");
		favoriteColor = input.next();
		
		System.out.println("How many siblings do you have?");
		siblings = input.nextInt();
		
		input.close();
		
		int retirementAge = 0;
		if (age % 2 == 0) {
			retirementAge = 79;
		} else {
			retirementAge = 99;
		}
		
		String vacationHome = "";
		if (siblings == 0) {
			vacationHome = "The Australian Outback";
		} else if (siblings == 1) {
			vacationHome = "The planet Alderon";
		} else if (siblings == 2) {
			vacationHome = "Springfield";
		} else if (siblings == 3) {
			vacationHome = "under the sea";
		} else {
			vacationHome = "a stranger's basement";
		}
		
		String transportation = "";
		switch (favoriteColor) {
		case "red":
			transportation = "balloon";
			break;
		case "orange":
			transportation = "RV";
			break;
		case "yellow":
			transportation = "chocobo";
			break;
		case "green":
			transportation = "flying carpet";
			break;
		case "blue":
			transportation = "submarine";
			break;
		case "indigo":
			transportation = "wombat";
			break;
		case "violet":
			transportation = "Batmobile";
			break;
			default: transportation = "foot";
		}
		
		int bankBalance = 0;
		if (birthMonth > 0 & birthMonth < 5) {
		bankBalance = 10;	
		} else if (birthMonth >= 5 & birthMonth < 9){
			bankBalance = 777;
		} else if (birthMonth >= 9 & birthMonth < 13) {
			bankBalance = 1000000;
		}
		
		System.out.println( firstName +" " + lastName + " will retire in " + retirementAge + " years with $" + bankBalance + " in the bank, a vacation home in " + vacationHome + " and travel by " + transportation + ".");
		
		}
	}
