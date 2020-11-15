import java.util.Scanner;
public class AverageRainfall{
	public static void main(String[] args){
		int maxYears;
		int totalMonths;
		int monthCount = 0;
		double rainInches = 0.0;
		double totalInches = 0.0; // Initialize total inches or rain
		double averageRainInches = 0.0; // Initialize total average of rain
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		maxYears = keyboard.nextInt();
		while (maxYears < 1){
			System.out.println("Invalid. Enter 1 or greater:");
			maxYears = keyboard.nextInt();
		}
		totalMonths = maxYears * 12;
		System.out.print("Enter the rainfall, in inches, for each month.\n");
		for (int yearCount = 1; yearCount <= maxYears; yearCount++){
			for (monthCount = 1; monthCount <= 12; monthCount++){
				System.out.println("Year " + yearCount + " month " +
				monthCount + ":");
				rainInches = keyboard.nextInt();
				while ( rainInches < 0 ){
					System.out.println("Invalid. Enter 0 or greater:");
					rainInches = keyboard.nextInt();
					totalInches += rainInches;
				}
				totalInches += rainInches;
			}

		}
		averageRainInches = (double) totalInches / totalMonths;
		System.out.println("Number of months: " + totalMonths);
		System.out.println("Total rainfall: " + totalInches);
		System.out.println("Average monthly rainfall: " + averageRainInches + " inches");
	}
}