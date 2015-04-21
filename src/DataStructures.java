import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    /**
     * Anthony Fermin
     * Write a method that takes a String sentence, breaks it up into an ArrayList of Strings (one word per ArrayList element),
     * and prints out the words in alphabetical order.
     */

    // splits a String into an ArrayList<String> of words split by spaces
    public static ArrayList<String> split(String sentence){
        ArrayList<String> words = new ArrayList<String>();

        while(true){

            int nextSpace = sentence.indexOf(' ');

            /**
             * If no space is found, adds remaining text to ArrayList and breaks from loop(indexOf returns -1 if character is not found)
             */
            if(nextSpace == -1){
                words.add(sentence);
                break;
            }else if(nextSpace == 0){
                sentence = sentence.substring(1);
            }else{
                words.add(sentence.substring(0,nextSpace));
                sentence = sentence.substring(nextSpace);
            }
        }
        return words;
    }

    // Alphabetically determines if first word should be swapped with the second word while ignoring case
    public static boolean shouldSwap(String first, String second)
    {
        first = first.toLowerCase();
        second = second.toLowerCase();

        int shortestWordLength;
        if(second.length() < first.length())
        {
            shortestWordLength = second.length();
        }else
        {
            shortestWordLength = first.length();
        }

        for(int i = 0; i < shortestWordLength; i++)
        {

            /** if ASCII value of char at i for first word is greater than char at i for second word,
             *  return true for shouldSwap method
             */
            if(first.charAt(i) > second.charAt(i))
            {
                return true;
            }else if(first.charAt(i) == second.charAt(i))
            {
                continue;
            }
            else
            {
                break;
            }
        }
        return false;
    }

    // swaps two indexes in an ArrayList<String>
    public static void swap(int index1, int index2, ArrayList<String> words){
        String firstString = words.get(index1);
        words.set(index1, words.get(index2));
        words.set(index2, firstString);
    }

    // alphabetizes an arrayList of Strings
    public static void alphabetize(ArrayList<String> words){
            for(int i = 0; i < words.size() - 1; i++)
            {
                for(int j = i; j >= 0; j--)
                {
                    String currentWord = words.get(j);
                    String nextWord = words.get(j+1);

                    if(shouldSwap(currentWord, nextWord))
                    {
                        swap(j, j + 1, words);
                    }else{
                        break;
                    }
                }
            }
    }

  public static void main (String args[]) {

      Scanner in = new Scanner(System.in);
      System.out.println("Enter a sentence to alphabetize: ");
      String sentence = in.nextLine();

      sentence = sentence.replaceAll("[^a-zA-Z]", " ");
      ArrayList<String> words = split(sentence);

      alphabetize(words);

      for(String word : words){
          System.out.print(word + " ");
      }
  }
}
