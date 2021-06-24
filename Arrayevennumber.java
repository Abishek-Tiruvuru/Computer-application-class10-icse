
    
/**
 * Question
 * 
 * Write a program to fill an array of type int of size 10 and print the
 * array and the even numbers in it.
 * 
 */

import java.util.Scanner;
public class Arrayevennumber
{   //main method
    public static void main(String[] args) 
    {   //initializing scanner class
        Scanner sc = new Scanner(System.in);
        // initializing the array
        int a[] = new int[10];
        // acepting the values
        System.out.println("Enter 10 numbers : ");
        for (int i = 0; i < a.length; i++) 
        {
            a[i] = sc.nextInt();
        }
        // printing the accepted array
        System.out.print("All numbers:");
        for(int i = 0 ; i < a.length ; i++)
        {
                System.out.print(a[i]+" ");
        }
        //separating and printing the even numbers of the arraya
        System.out.println("");
        System.out.print("Even numbers:");
        for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
            }
        }
        //closing scanner class
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
All numbers:1 2 3 4 5 6 7 8 9 0 
Even numbers:2 4 6 8 0
 */
