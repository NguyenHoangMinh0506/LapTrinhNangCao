package LyThuyetTuan1;

import java.util.Scanner;

public class Buoi1_Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many days' temperatures? ");
		int numDays = scanner.nextInt();

		int[] temperatures = new int[numDays];
		int sum = 0;

		for (int i = 0; i < numDays; i++) {
			System.out.print("Day " + i + "'s high temp: ");
			temperatures[i] = scanner.nextInt();
			sum += temperatures[i];
		}

		double average = (double) sum / numDays;
		System.out.println("Average temp = " + average);

		double variance = calculateVariance(temperatures, average);
		System.out.println("Variance = " + variance);

		double standardDeviation = Math.sqrt(variance);
		System.out.println("Standard Deviation = " + standardDeviation);

		int aboveAverageCount = countDaysAboveAverage(temperatures, average);
		System.out.println(aboveAverageCount + " days were above average");

		scanner.close();
	}

	public static double calculateVariance(int[] temperatures, double average) {
		double sumOfSquaredDifferences = 0;
		for (int temp : temperatures) {
			double difference = temp - average;
			sumOfSquaredDifferences += difference * difference;
		}
		return sumOfSquaredDifferences / temperatures.length;
	}

	public static int countDaysAboveAverage(int[] temperatures, double average) {
		int aboveAverageCount = 0;
		for (int temp : temperatures) {
			if (temp > average) {
				aboveAverageCount++;
			}
		}
		return aboveAverageCount;
	}
}
