package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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

        if (!strings.isEmpty()) {
            System.out.println("The last item in this list is: " + strings.get(strings.size() - 1));
        } else {
            System.out.println("The list is empty.");
        }
    }
}
