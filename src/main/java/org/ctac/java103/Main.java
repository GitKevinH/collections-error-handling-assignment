package org.ctac.java103;

import java.util.*;

//       Define a List of integers with at least one set of duplicates.
//        Use a Set to remove duplicates.
//        Calculate the sum and average of the integers.
//        Print the sum, average, and the list of integers without duplicates.
//        Handle exceptions, such as IndexOutOfBoundsException, IllegalArgumentException, and ArithmeticException.
//        Use try-catch-finally and multi-catch blocks as needed.
public class Main {
    public static void main(String[] args) {

        try {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
            numbers.add(7);
            numbers.add(8);
            numbers.add(9);
            numbers.add(10);
            numbers.add(10);  // Dupe

            Set<Integer> noDupesSet = new HashSet<>(numbers);

            printSet(noDupesSet);

            System.out.println();

            System.out.println("Sum of this set: " + sum(noDupesSet));

            System.out.println("Average of this set: " + average(noDupesSet));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
    }



    public static int sum(Set<Integer> numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }


    public static double average(Set<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("Cannot calculate average of an empty set.");
        }

        int sum = 0;
        int count = 0;

        for (int number : numbers) {
            sum += number;
            count++;
        }

        return (double) sum / count;
    }

    public static void printSet(Set<Integer> numbers) {
        System.out.print("Items in the Set: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
