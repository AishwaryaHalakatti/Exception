
package com.MultipleCatch;

import java.util.Scanner;

import static com.MultipleCatch.PerfromMultipleCatch.performDivision;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            // Attempt to perform division
            performDivision();

        } catch (ArithmeticException e) {
            // Handle division by zero
            System.err.println("Error: Division by zero is not allowed.");

        } catch (NumberFormatException e) {
            // Handle invalid input (non-numeric)
            System.err.println("Error: Please enter valid numeric values.");

        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }


}