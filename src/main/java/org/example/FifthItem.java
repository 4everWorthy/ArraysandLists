package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            System.out.print("Enter a string (empty to stop): ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        if (strings.size() >= 5) {
            System.out.println("The fifth item in the list is: " + strings.get(4));
        } else {
            System.out.println("There are fewer than 5 items in the list.");
        }
    }
}
