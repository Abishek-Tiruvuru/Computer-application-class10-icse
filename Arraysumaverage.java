
/**
 * Question
 * 
 * Write a program to fill an array of type of size 10 print the sum and average.
 */

import java.util.Scanner;

public class Arraysumaverage {
    // main method

    public static void main(String[] args) {
        //initializing scanner class
        Scanner sc = new Scanner(System.in);
        // intilizing the variables
        int num[] = new int[10];
        int sum = 0;
        int average = 0;
        //accepting the values for the array
        System.out.println("Enter 10 numbers : ");

        for (int i = 0; i < num.length; i++) {

            num[i] = sc.nextInt();

        }
        //printing the array
        System.out.print("sum of all numbers:");

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
        // calculating the average of the array
        average = sum / num.length;
        //printing the averageof the array
        System.out.println("Average : " + average);
        // closing scanner class
        sc.close();

    }
}

/**
 * OUTPUT
 * 
 * Enter 10 numbers : 
1
2
3
4
5
6
7
8
9
0
sum of all numbers:45
Average : 4
 */