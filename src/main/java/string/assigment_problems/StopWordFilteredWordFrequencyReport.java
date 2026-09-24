package string.assigment_problems;

import java.util.Scanner;

public class StopWordFilteredWordFrequencyReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();

        System.out.print("Enter stop words separated by spaces: ");
        String stopInput = sc.nextLine().toLowerCase();

        String[] words = sentence.split("\\s+");
        String[] stopWords = stopInput.split("\\s+");

        System.out.println("Word Frequency Report:");

        for (int i = 0; i < words.length; i++) {
            String word = words[i].replaceAll("[^a-z]", "");

            if (word.isEmpty() || isStopWord(word, stopWords)) {
                continue;
            }

            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                String previous = words[j].replaceAll("[^a-z]", "");

                if (word.equals(previous) && !isStopWord(previous, stopWords)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                int count = 0;

                for (int j = 0; j < words.length; j++) {
                    String current = words[j].replaceAll("[^a-z]", "");

                    if (word.equals(current)) {
                        count++;
                    }
                }

                System.out.println(word + ": " + count);
            }
        }

        sc.close();
    }

    static boolean isStopWord(String word, String[] stopWords) {
        for (String stopWord : stopWords) {
            if (word.equals(stopWord)) {
                return true;
            }
        }

        return false;
    }
}