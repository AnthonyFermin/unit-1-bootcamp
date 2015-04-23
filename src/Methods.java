import java.lang.Math.*;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods
{

    // calculates the square of a number
    public static int calculateSquare(int num)
    {
        return num * num;
    }

    // calculates the square root of a number
    public static double calculateSquareRoot(int num)
    {
        return Math.sqrt(num);
    }

    public static void main(String args[])
    {
        System.out.println(calculateSquare(4));
        System.out.println(calculateSquareRoot(4));

    }
}
