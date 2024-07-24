package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        // Collect integers until the user enters zero
        System.out.println("Enter integers (0 to stop):");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            }
            integers.add(input);
        }

        // Print the list items in the required format
        if (integers.size() > 0) {
            for (int i = 0; i < integers.size(); i++) {
                if (i == integers.size() - 1 && integers.size() > 1) {
                    System.out.print("and " + integers.get(i));
                } else if (i == integers.size() - 1) {
                    System.out.print(integers.get(i));
                } else {
                    System.out.print(integers.get(i) + ", ");
                }
            }
            System.out.print(" were the items in the list. The sum of that list is:\n");

            // Calculate the sum
            int sum = getSum(integers);
            System.out.println(sum);
        } else {
            System.out.println("No items in the list.");
        }
    }

    public static int getSum(ArrayList<Integer> integers) {
        int sum = 0;
        for (int number : integers) {
            sum += number;
        }
        return sum;
    }
}

