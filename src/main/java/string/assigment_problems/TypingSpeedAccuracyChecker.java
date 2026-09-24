package string.assigment_problems;

import java.util.Scanner;

public class TypingSpeedAccuracyChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original text: ");
        String original = sc.nextLine();

        System.out.print("Enter the typed text: ");
        String typed = sc.nextLine();

        int correct = 0;
        int minLength = Math.min(original.length(), typed.length());

        for (int i = 0; i < minLength; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                correct++;
            }
        }

        int totalCharacters = original.length();

        double accuracy = (totalCharacters == 0)
                ? 0
                : (correct * 100.0) / totalCharacters;

        int words = typed.trim().isEmpty()
                ? 0
                : typed.trim().split("\\s+").length;

        System.out.println("Correct Characters: " + correct);
        System.out.println("Typed Words: " + words);
        System.out.printf("Accuracy: %.2f%%%n", accuracy);

        sc.close();
    }
}