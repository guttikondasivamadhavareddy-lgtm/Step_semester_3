package string.assigment_problems;

import java.util.Scanner;

public class LibraryIsbnNormalizerValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

        String normalized = isbn.replaceAll("[^0-9]", "");

        System.out.println("Normalized ISBN: " + normalized);

        if (normalized.length() == 10 || normalized.length() == 13) {
            System.out.println("Valid ISBN length");
        } else {
            System.out.println("Invalid ISBN length");
        }

        sc.close();
    }
}