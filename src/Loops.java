import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {



    // returns nth fibonacci number
    public static long fib(int n){
        long previousFib = 0;
        long currentFib = 1;
        long nextFib = 1;

        if(n == 0){
            return previousFib;
        }
        for(int i = 2; i <= n; i++){

            previousFib = currentFib;
            currentFib = nextFib;
            nextFib = previousFib + currentFib;

        }
        return currentFib;
    }

    /**
     * Write a method that prints the first ten Fibonnaci numbers.
     */
    public static void first10Fib(){

        System.out.println("\nFirst 10 Fibonnaci Numbers: ");

        for(int i = 0; i < 10; i++){
            System.out.println("fib(" + i + "): " + fib(i));
        }
    }

    /**
     * Modify the method to sum the first ten Fibonnaci numbers.
     */
    public static void sum10Fib(){

        int sum = 0;
        for(int i =0; i < 10; i++){
            sum+=fib(i);
        }
        System.out.println("\nThe sum of the first 10 fibonacci numbers is: " + sum);
    }

    /**
     *  Use nested for loops to generate a list of all the positive two digit numbers.
     *  Display the numbers, and the sums of their digits
     */
    public static void digits() {
        System.out.println("\nList of all positive two digit numbers and the sums of their digits: ");

        for(int i = 1; i < 10; i++){
            for(int j = 0; j < 10; j++){
                int sum = i+j;
                System.out.println( Integer.toString(i) + Integer.toString(j) + ", " + i + "+" + j + " = " + sum);
            }
        }
    }

    /**
     *  Use nested for loops to generate a list of all the pairs of positive two
     *  digit numbers whose sum is 60, and whose difference is 14.
     */
    public static void numberPuzzle(){

        System.out.println("\nNumber Puzzle - Digits whose sum is 60 and whose difference is 14:");

        for(int i = 30; i < 60; i++){

           for(int j = 30; j > 9; j-- ){
                if(i+j == 60 && (i-j == 14 || j-i == 14)){
                    System.out.println("The sum of " + i + " and " + j + " is 60 and their difference is 14.");
                }

           }
        }

    }

    // method for isNot which replaces all occurrences of is with is not
    public static String notReplace(String toReplace){
        String isReplaced = "";
        toReplace = "_" + toReplace + "_";

        for(int i = 1; i < toReplace.length() - 1; i++){

            if(toReplace.substring(i,i+2).equals("is")){

                if(!Character.isLetter(toReplace.charAt(i -1))
                        && !Character.isLetter(toReplace.charAt(i + 2))){
                    isReplaced += "is not";
                    i++;
                }else{
                    isReplaced += toReplace.charAt(i);
                }

            }else{
                isReplaced += toReplace.charAt(i);
            }

        }
        return isReplaced;
    }

    /**
     * Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
     * The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does
     * not count. (Note: Character.isLetter(char) tests if a char is a letter.)

        notReplace("is test") → "is not test"
        notReplace("is-is") → "is not-is not"
        notReplace("This is right") → "This is not right"
     *
     */

    public static void isNot(){

        System.out.println("\nisNot exercise, replace all occurrences of the word \"is\" with \"is not\"");

        System.out.println("notReplace(\"is test\") → " + notReplace("is test"));
        System.out.println("notReplace(\"is-is\") → " + notReplace("is-is"));
        System.out.println("notReplace(\"This is right\") → " + notReplace("This is right") );


    }


    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int response = 0;

        System.out.println("Welcome to LOOPS!");

        do
        {

            // pausing the program
            try {
                Thread.sleep(4000);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\nEXERCISES\n" +
                                       "1. Write a method that prints the first ten Fibonnaci numbers.\n" +
                                       "2. Modify the method to sum the first ten Fibonnaci numbers.\n" +
                                       "3. isNot\n" +
                                       "4. numberPuzzle\n" +
                                       "5. digits\n" +
                                       "\n");

            System.out.print("Enter the exercise number to run the exercise or enter a negative number to quit: ");

            // if user enters a non integer number, the program exits
            try
            {
                response = in.nextInt();
            }catch(InputMismatchException e){
                System.err.println("\nThat is not a number!");
                System.exit(0);
            }

            // runs a method based on the response from the user
            switch(response){
                case 1:
                    first10Fib();
                    break;
                case 2:
                    sum10Fib();
                    break;
                case 3:
                    isNot();
                     break;
                case 4:
                    numberPuzzle();
                    break;
                case 5:
                    digits();
                    break;
                default:
                    System.out.println("Not a valid selection!\n");
            }

        }while(response > 0); // loop ends if user enters a negative number

        System.out.println("Thank you for running LOOPS! Take care!");

    }

}
