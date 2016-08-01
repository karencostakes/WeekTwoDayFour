import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab8TakeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan1 = new Scanner(System.in);

		String choice = "yes";
		int userInput = 0;

		while (choice.equalsIgnoreCase("yes")) {
	
			//int userInput=0;
			System.out.println("Welcome to Batting Average Calculator!");
			System.out.println("Enter number of times at bat: ");
			userInput = scan1.nextInt();
			scan1.nextLine();
			if (userInput <=0)
			{ try
			{ throw new IndexOutOfBoundsException ();
			}
			catch (IndexOutOfBoundsException e)
			{ System.out.println("Please enter a positive number.");
			//userInput = scan1.nextInt();
			}
			}

			else {

			battingStats(scan1, userInput);
			System.out.println("Continue? (Enter Yes or No)");
			choice = scan1.nextLine();

		}
		}
	}
	

	public static void battingStats(Scanner scan1, int userInput) {
		int[] batter = new int[userInput];
		float battingAveragePieceOne = 0; // number of at bats where player
											// earned at least 1 hit/
											// userInput;
		float sluggingAveragePieceOne = 0; // sluggingAverage = total number
											// of
											// bases earned/userInput

		System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");

		for (int i = 0; i < userInput; i++) {

			System.out.println("Result for at bat " + i);
			batter[i] = scan1.nextInt();
			scan1.nextLine();
			while (batter[i] > 4 || batter[i] < 0) {
				try {
					throw new ArrayIndexOutOfBoundsException();
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Please enter a number between 0 - 4.  Result for at bat " + i + ":");
					batter[i] = scan1.nextInt();
					scan1.nextLine();
				}
			}

			sluggingAveragePieceOne = sluggingAveragePieceOne + batter[i];

			if (batter[i] > 0) {
				battingAveragePieceOne = battingAveragePieceOne + 1;

			}
			// test
		}

		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(3);
		System.out.println("Batting Average: " + df.format (battingAveragePieceOne/userInput));
		//System.out.println("Number of at bats where player earned at least 1 base" + battingAveragePieceOne);
		//System.out.println("Number of at bats" + userInput);
		//System.out.println("Number of bases earned" + sluggingAveragePieceOne);
		System.out.println("Slugging Average: " + df.format (sluggingAveragePieceOne / userInput));
		//System.out.printf("%2f", battingAveragePieceOne / userInput);
		//System.out.printf("%2f", sluggingAveragePieceOne / userInput);
	}

}
