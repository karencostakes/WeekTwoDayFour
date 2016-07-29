import java.util.Scanner;

public class Lab8TakeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan1 = new Scanner(System.in);

		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) {

			int userInput;
			System.out.println("Welcome to Batting Average Calculator!");
			System.out.println("Enter number of times at bat: ");
			userInput = scan1.nextInt();
			scan1.nextLine();
			battingStats(scan1, userInput);
			System.out.println("Continue?");
			choice = scan1.nextLine();
		}

	}

	public static void battingStats(Scanner scan1, int userInput) {
		int[] batter = new int[userInput];
		float battingAveragePieceOne = 0; // number of at bats where player
											// earned at least 1 hit
											// userInput;
		float sluggingAveragePieceOne = 0; // sluggingAverage = total number
											// of
											// bases earned/userInput

		System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");

		for (int i = 0; i < userInput; i++) {

			System.out.println("Result for at bat " + i);
			batter[i] = scan1.nextInt();
			scan1.nextLine();
			sluggingAveragePieceOne = sluggingAveragePieceOne + batter[i];

			if (batter[i] > 0) {
				battingAveragePieceOne = battingAveragePieceOne + 1;

			}
//test
		}

		System.out.println(battingAveragePieceOne / userInput);
		System.out.println(sluggingAveragePieceOne / userInput);
	}

}
