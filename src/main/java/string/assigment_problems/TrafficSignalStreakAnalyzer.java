package string.assigment_problems;

import java.util.Scanner;

public class TrafficSignalStreakAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of signals: ");
        int n = sc.nextInt();

        String[] signals = new String[n];

        System.out.println("Enter signals (Red, Yellow, Green):");
        for (int i = 0; i < n; i++) {
            signals[i] = sc.next();
        }

        int currentGreen = 0;
        int longestGreen = 0;

        for (int i = 0; i < n; i++) {
            if (signals[i].equalsIgnoreCase("Green")) {
                currentGreen++;

                if (currentGreen > longestGreen) {
                    longestGreen = currentGreen;
                }
            } else {
                currentGreen = 0;
            }
        }

        System.out.println("Longest Green Signal Streak: " + longestGreen);

        sc.close();
    }
}