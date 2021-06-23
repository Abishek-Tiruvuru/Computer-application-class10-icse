
/**
 * Question
 * 
 * Write a program to fill an array of type int of size 10 and and accept scores of 10 students.Then print the number of students who have scored above int.
 * 
 */

import java.util.Scanner;

public class Arrayscoretest {
    // main method
    public static void main(String[] args) {
        // initalizing the scanner class
        Scanner sc = new Scanner(System.in);
        // initiallizing the array
        int a[] = new int[10];
        // Accepting the values for the array
        System.out.println("Enter the score 10 students : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        // accepting value for othre variable and intializing them
        System.out.println("Enter a score to see the number of students who have scored above it : ");
        int pass = sc.nextInt();
        int c = 0;
        // printing the array
        System.out.print("All numbers:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        // calculating number of students who scored above pass
        System.out.print("Students who have scored above " + pass + " are ");
        for (int i = 0; i < 10; i++) {
            if (a[i] > pass) {
                c++;

            }

        }
        // printing number of students who scored above pass
        System.out.println(c);
        // closing scanner class
        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * EEnter the score 10 students : 1 2 3 4 5 6 7 8 9 10 Enter a score to see the
 * number of students who have scored above it : 6 All numbers:1 2 3 4 5 6 7 8 9
 * 10 Students who have scored above 6 are 4
 */
