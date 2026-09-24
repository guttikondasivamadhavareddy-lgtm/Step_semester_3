package string.assigment_problems;

import java.util.Scanner;

public class MovieReviewWordLengthProfiler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        String review = sc.nextLine();

        String[] words = review.trim().split("\\s+");

        int totalLength = 0;
        int longestLength = 0;
        String longestWord = "";

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");

            if (!cleanWord.isEmpty()) {
                totalLength += cleanWord.length();

                if (cleanWord.length() > longestLength) {
                    longestLength = cleanWord.length();
                    longestWord = cleanWord;
                }
            }
        }

        int wordCount = words.length;

        double averageLength = wordCount == 0
                ? 0
                : (double) totalLength / wordCount;

        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Longest Word Length: " + longestLength);
        System.out.printf("Average Word Length: %.2f%n", averageLength);

        sc.close();
    }
}