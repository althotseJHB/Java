// package Java;

// public class SimpleCoinFlip {
    
// }

// package za.co.wethinkcode.examples.coinflip;

/*  Flip a coin
    Below is a short Java program introduces the basics of Java. It is not object-oriented. For now, just get familiar with Java so that you can learn OOP in the next section.
    The program below simulates the flip of a coin. It randomly chooses the number 0 or 1. If the number is 0 then it prints HEADS! to the console. If the number is 1 then TAILS! is printed to the console.
*/
package Java;

import java.util.Random;                           // 1.                         

class SimpleCoinFlip {                             // 2.                         
    public static void main(String[] args) {       // 3.       
        Random randomiser = new Random();          // 4.      

        int number = randomiser.nextInt(2);        // 5.     

        if (number == 0) {                         // 6.  
            System.out.println("HEADS!");          // 7.     
        } else {                                   // 8.     
            System.out.println("TAILS!");          // 9.     
        }
    }
}

/*
    1. 	Import the random number generator Random from the standard Java utility library.
    2.  class is used to describe an object. That’s a mouthful and will be explained in the Encapsulation section. For now, assume that all code needs to be written inside a class. Importantly, the name of the class should be the same name as the source file.
    3.  main is the entry point for the program. It is the first thing that is executed by the JVM. It is a method (i.e. a procedure) that has an array of strings as a parameter. This array is populated with the command line arguments. We are not using the command line args in this program.
    4.  Create a new Random object and assign it to the variable randomiser. Again, don’t trouble yourself too much about the concept of an object. For now, think of randomiser as a variable that has all the functionality of Random from the java standard library. Notice the use of semicolon ; to end the statement. This means that you can write the code over several lines and simply end it with a semicolon.
    5.  Call the nextInt() method of the Random object and assign it to the variable number. Notice how you have to specify the type of the variable int. The nextInt() method (procedure) takes an input value of 2. This tells randomiser to randomly pick a number between 0 and 2 excluding 2 itself. You can read the docs for nextInt().
    */

