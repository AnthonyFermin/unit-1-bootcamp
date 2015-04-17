import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * Created by alexandraqin on 4/14/15.
 * Exercises:

 Import the HashSet and create a HashSet object.
 Use a HashSet to figure out how many unique words are in A Tale of Two Cities and Moby Dick, respectively. Feel free to refer back to the Verbosity Calculator assignment.
 Clean up the code - your HashSet currently thinks "the." and "the" and "The" are all different words! Do some String operations to make your word counts more accurate.
 Create a set that is the intersection of words between A Tale of Two Cities and Moby Dick. What is the cardinality (size) of this set?
 Create a set that is the union of words between A Tale of Two Cities and Moby Dick.
 Create an iterator for the union set.
 For fun - try this again but with two books from the same author!
 */



public class UsingAPIs {

  public static void main (String args[]) throws FileNotFoundException
  {

      HashSet<String> twoCitiesWords = new HashSet<String>();
      HashSet<String> mobyDickWords = new HashSet<String>();

      File twoCities = new File("/Users/c4q-anthonyf/Desktop/accesscode/unit-1-bootcamp/resources/ATaleOfTwoCities.txt");
      File mobyDick = new File("/Users/c4q-anthonyf/Desktop/accesscode/unit-1-bootcamp/resources/MobyDick.txt");

      // Getting a unique set of words for A Tale of Two Cities

      Scanner twoCitiesSc = new Scanner(twoCities);
      String formattedTwoCities = "";

      while(twoCitiesSc.hasNextLine()){
          formattedTwoCities += twoCitiesSc.nextLine() + " ";
      }
      formattedTwoCities = formattedTwoCities.toLowerCase().replaceAll("[^a-zA-Z]", " ");

      Scanner CitiesSc = new Scanner(formattedTwoCities);

      while(CitiesSc.hasNext()){
          twoCitiesWords.add(CitiesSc.next());
      }

      // Getting a unique set of words for Moby Dick

      Scanner mobyDickSc = new Scanner(mobyDick);
      String formattedMobyDick = "";

      while(mobyDickSc.hasNextLine()){
          formattedMobyDick += mobyDickSc.nextLine() + " ";
      }
      formattedMobyDick = formattedMobyDick.toLowerCase().replaceAll("[^a-zA-Z]", " ");

      mobyDickSc = new Scanner(formattedMobyDick);

      while(mobyDickSc.hasNext()){
          mobyDickWords.add(mobyDickSc.next());
      }

      System.out.println("Moby Dick unique word count: " + mobyDickWords.size());
      System.out.println("A Tale of Two Cities unique word count: " + twoCitiesWords.size());

      HashSet<String> nonIntersection = new HashSet<String>(mobyDickWords);
      nonIntersection.removeAll(twoCitiesWords);
      HashSet<String> intersectionWords = new HashSet<String>(mobyDickWords);
      intersectionWords.removeAll(nonIntersection);

      System.out.println("\nSize of Intersection of Words: " + intersectionWords.size());

      HashSet<String> unionWords = new HashSet<String>(mobyDickWords);
      unionWords.addAll(twoCitiesWords);
      System.out.println("Size of Union of Words: " + unionWords.size());

      Iterator<String> unionIterator = unionWords.iterator();

      System.out.println("\nList of Union Words: ");
      while(unionIterator.hasNext()){
          System.out.print(unionIterator.next());
          if(unionIterator.hasNext()){
              System.out.print(", ");
          }
      }
      System.out.println();

  }
}
