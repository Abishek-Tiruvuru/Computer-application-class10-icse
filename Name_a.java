
/**
 * Question
 * 
 * Write a program to accept 10 names from the user and print only the names that start with A.
 */

import java.util.Scanner;

public class Name_a {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n[] = new String[10];

        System.out.println("Please enter names : ");
        for (int i = 0; i < n.length; i++)

            n[i] = scanner.next();

        System.out.println("The names that contain a are : ");
        for (int i = 0; i < n.length; i++)

            if (n[i].charAt(0) == 'A' || n[i].charAt(0) == 'a')

                System.out.println(n[i]);

        scanner.close();

    }
}