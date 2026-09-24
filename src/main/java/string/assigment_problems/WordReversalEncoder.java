package string.assigment_problems;

import java.util.Scanner;

public class WordReversalEncoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");

        System.out.print("Encoded sentence: ");

        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            String reverse = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverse += word.charAt(j);
            }

            System.out.print(reverse);

            if (i > 0) {
                System.out.print(" ");
            }
        }

        System.out.println();

        sc.close();
    }
}