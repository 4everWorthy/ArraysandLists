package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        // Collect integers until the user enters zero
        while (true) {
            System.out.print("Enter an integer (0 to stop): ");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            }
            integers.add(input);
        }

        // Indicate that input collection is done
        System.out.println("Done entering integers into the list");

        // Ask the user for the number to find
        System.out.print("What number are you looking for in the list? ");
        int numberToFind = Integer.parseInt(scanner.nextLine());

        // Find all indices of the number in the list
        boolean found = false;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) == numberToFind) {
                System.out.println(numberToFind + " is at index " + i);
                found = true;
            }
        }

        // If the number was not found, print a message
        if (!found) {
            System.out.println(numberToFind + " is not in the list.");
        }
    }
}
