
/**
 * Question
 * 
 * Write a program that encodes a word into Piglatin. To translate a word into a Piglatin word, convert the word into
 * uppercase and then place the first vowel of the original word as the start of the new word along with the remaining alphabets.
 * The alphabets present before the vowel being shifted towards the end followed by “AY”.
 * 
 * Sample Input (1) : London,
 * Sample Output (1) : ONDONLAY
 * 
 * Sample Input (2) : Olympics,
 * Sample Output (2) : OLYMPICSAY
 * 
 */

// importing the necessary packages.
import java.util.*;

// creating the class.
public class Stringpiglatin {

    // declaring the variables.

    String in;
    String out;

    Character ch;

    public Stringpiglatin() {

        // initializing the variables.

        in = "";
        out = "";

        ch = 'A';

    }

    // creating a method to accept user input.
    public void accept() {

        // accepting the user input.

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        in = sc.next();
        sc.close();

        in = in.toUpperCase();

    }

    // creating a method
    public void change() {

        int i;

        for (i = 0; i < in.length(); i++) {
            ch = in.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                break;
        }

        out = in.substring(i) + in.substring(0, i) + "AY";

    }

    // creating a method to display
    public void display() {

        // displaying the piglatin word.

        System.out.println("Your word in Piglatin is: " + out);

    }

    //main method
    public static void main(String args[]) {

        // Calling the methods

        Stringpiglatin piglatin = new Stringpiglatin();

        piglatin.accept();
        piglatin.change();
        piglatin.display();

    }
}

/**
 * Output
 * 
 * Please enter a word: Olympics Your word in Piglatin is : OLYMPICSAY
 * 
 */