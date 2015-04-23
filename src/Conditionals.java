/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    /**
     * Given three ints, a b c, one of them is small, one is medium and one is large.
     * Return true if the three values are evenly spaced, so the difference between small
     * and medium is the same as the difference between medium and large.
     */
    public static boolean evenlySpaced(int small, int medium, int large){
        return (medium - small) == (large - medium);
    }

  public static void main (String args[]) {

      System.out.println("2, 4, and 6 are evenly spaced: " + evenlySpaced(2,4,6));
      System.out.println("1, 4, and 7 are evenly spaced: " + evenlySpaced(1,4,7));
      System.out.println("3, 4, and 7 are evenly spaced: " + evenlySpaced(3,4,7));

  }
}
