/**
 * Question
 * 
 * Write a program to fill an array of type int of size 10 and print te array.
 * 
 */
import java.util.*;

class Arrays {
    // main method
    public static void main(String args[]) {
        // intializing scanner class
        Scanner sc = new Scanner(System.in);
        //initializing the array
        int Array[] = new int[10];
        //accepting the value of the arrays
        System.out.println("Enter 10 numbers");
        for (int x = 0; x < 10; x++) {
            Array[x] = sc.nextInt();
        }
        //closing scanner class
        sc.close();
        //printing array
        System.out.println("The values of the array are below");
        for (int x = 0; x < 10; x++) {
            System.out.println(Array[x]);
        }
    }
}

/**
 * OUTPUT
 * 
 * Enter 10 numbers
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
The values of the array are below
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
 */