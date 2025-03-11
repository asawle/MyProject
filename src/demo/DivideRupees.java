package demo;

public class DivideRupees {

	public static void main(String[] args) {
		int count = 0;
		// Iterate through all possible combinations of notes
		for (int oneRupee = 0; oneRupee <= 10; oneRupee++) {
			for (int twoRupee = 0; twoRupee <= 10; twoRupee++) {
				for (int fiveRupee = 0; fiveRupee <= 10; fiveRupee++) {
					for (int twentyRupee = 0; twentyRupee <= 10; twentyRupee++) {
						for (int fiftyRupee = 0; fiftyRupee <= 10; fiftyRupee++) {
							int totalNotes = oneRupee + twoRupee + fiveRupee + twentyRupee + fiftyRupee;
							int totalValue = oneRupee * 1 + twoRupee * 2 + fiveRupee * 5 + twentyRupee * 20
									+ fiftyRupee * 50;

							if (totalNotes == 10 && totalValue == 100) {
								count++;
								System.out.println("Combination " + count + ": " + oneRupee + " x 1 Rupee, " + twoRupee
										+ " x 2 Rupees, " + fiveRupee + " x 5 Rupees, " + twentyRupee + " x 20 Rupees, "
										+ fiftyRupee + " x 50 Rupees.");
							}
						}
					}
				}
			}
		}
	}
}
