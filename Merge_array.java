
/**
 * Question
 * 
 * Write a program to accept 2 array of type int of size from the user with the scores of 10 students and print the
 * number of students who scored more than int.
 * 
 */

import java.util.*;

class Merge_array {
  
    
    // Main method
    public static void main(String args[]) {
        //initializing scanner class
        Scanner sc = new Scanner(System.in);
        //Accepting array size
        System.out.println("Enter first array size : ");

        int size1 = sc.nextInt();
        System.out.println("Enter second array size : ");

        int size2 = sc.nextInt();
        //Accepting first array
        System.out.println("Enter array 1 : ");
        int arr1[] = new int[size1];
        for (int i = 0; i < arr1.length; i++) {

            arr1[i] = sc.nextInt();

        }

        int n1 = arr1.length;
        //Accepting second array 
        System.out.println("Enter array 2 : ");
        int arr2[] = new int[size2];
        for (int i = 0; i < arr2.length; i++) {

            arr2[i] = sc.nextInt();

        }

        int n2 = arr2.length;
        //initializing third array
        int arr3[] = new int[n1 + n2];
        //Merging both arrays
        int i = 0, j = 0, k = 0;

         while (i < n1 ) {
            arr3[k++] = arr1[i++];
            
        }

        while ( j < n2) {
            
            arr3[k++] = arr2[j++];
        }

        
        while (i < n1)
            arr3[k++] = arr1[i++];

    
        while (j < n2)
            arr3[k++] = arr2[j++];
        // printing the third array
        System.out.println("Array after merging");
        for (int l = 0; l < n1 + n2; l++)
            System.out.print(arr3[l] + " ");
            //closing scanner class
        sc.close();
    }
}

/*
Output

Enter array size : 
5
Enter array 1 : 
1
2
3
4
5
Enter array 2 : 
1
2
3
4
5
Array after merging
1 2 3 4 5 1 2 3 4 5
 * 
 */