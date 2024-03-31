
package com.MultipleCatch;

import java.util.Scanner;
public class PerformMultipleCatch {
    public static void performDivision() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get user input for division
            System.out.print("Enter the numerator: ");
            int numerator = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the denominator: ");
            int denominator = Integer.parseInt(scanner.nextLine());

            // Perform division
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);

        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
}