import java.util.Scanner;

public class fortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Hello! I am the great Fortune Teller.Tell me, What is your firstname?");
		String firstname = input.nextLine();
		System.out.println(" What is your lastname?");
		String lastname = input.nextLine();

		System.out.println("Hello, " + firstname);

		System.out.println("What is your age?");

		int userAge = 0;

		userAge = input.nextInt();
		String retireAge = null;
		if (userAge % 2 == 0) {
			retireAge = "you will retire in 20 years";
		}

		else {
			retireAge = "you will retire in 15 years";
		}

		System.out.println("what month were you born (enter a number value for the month (e.g. 9 for september)?");
		int month = 0;
		month = input.nextInt();
		String bankAmount = null;

		if (month <= 0) {

			bankAmount = "your bank balance at retiment will be $0";
		}
		if (month <= 4) {
			bankAmount = "your bank balance at retiment will be $500,000";
		}
		if (month <= 8) {
			bankAmount = "your bank balance at retiment will be $900,000";
		}
		if (month <= 12) {
			bankAmount = "your bank balance at retiment will be $1.5million";
		}

		System.out.println("I still need a bit more information to get your accurate fortune!");

		boolean helpLoop = false;
		String userTransportation = null;

		while (helpLoop)
			;

		{
			System.out.println("What is your favorite ROYGBIV color?");
			System.out.println(
					"If you don't know what ROYGBIV colors are, press Enter \"Help\" for a list of ROYGBIV colors.");
			String userColor = input.next();
			switch (userColor.toLowerCase()) {
			case "red":
				userTransportation = "your mode of transportation is a Tesla";
				helpLoop = false;
				break;
			case "orange":
				userTransportation = "your mode of transportation is a Horse";
				helpLoop = false;
				break;
			case "yellow":
				userTransportation = "your mode of transportation is a Donkey";
				helpLoop = false;
				break;
			case "green":
				userTransportation = "your mode of transportation is a Rollerblades";
				helpLoop = false;
				break;
			case "blue":
				userTransportation = "your mode of transportation is a Uber";
				helpLoop = false;
				break;
			case "indigo":
				userTransportation = "your mode of transportation is a Walking";
				helpLoop = false;
				break;
			case "violet":
				userTransportation = "your mode of transportation is a Bike";
				helpLoop = false;
				break;
			case "help":
				System.out.println("ROYGBIV colors are Red, Orange, Yellow, Green, Blue, Indigo, Violet.");
				userColor = "help";
				break;
			}

			System.out.println("How many siblings do you have?");

			// 0 siblings = Portland, Maine ; 1 sibling = The Pitons, St. Lucia; 2 siblings
			// = Honolulu, Hawaii, 3 siblings = Miami, Florida; greater than 3 = Winona, MN,
			// less than 0 = Kenai, Alaska

			String siblings = input.next();
			String vacayLocation = null;
			switch (siblings) {
			case "-1":
				vacayLocation = "Portland, Maine";
				break;
			case "0":
				vacayLocation = "Kenai, Alaska";
				break;
			case "1":
				vacayLocation = "The Pitons, St. Lucia";
				break;
			case "2":
				vacayLocation = "Honolulu, Hawaii";
				break;
			case "3":
				vacayLocation = "Winona, MN";
				break;
			default:
				vacayLocation = "Miami Florida";
			}

			System.out.println(firstname + " " + lastname + " " + retireAge + " " + "in" + " " + vacayLocation + " "
					+ "and" + " " + bankAmount + " " + "and" + " " + userTransportation + " ");

			System.out.print("Thank you for playing the Fortune Tellergame!");
			input.close();
		}

	}
}
