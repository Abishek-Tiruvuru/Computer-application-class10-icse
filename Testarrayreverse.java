/**
 * Question
 * 
 * Write a program to fill an array of type int of size 10 and print the reverse of it.
 * 
 */
public class Testarrayreverse {  
    // main method
    public static void main(String[] args) {  
       //intializing the array
        int [] arr = new int [] {1, 2, 3, 4, 5}; 
        // printing original array 
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        // reversing and printing array
        System.out.println();  
        System.out.println("Array in reverse order: ");  
      
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  

/**
 * OUTPUT
 * 
 * Original array: 
 * 1 2 3 4 5
 * Array in reverse order: 
 * 5 4 3 2 1
 */