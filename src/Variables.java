/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables
{

    /**
     * The instructions only ask for the method signature but I decided to go a bit further for the
     * extra challenge on some methods
     */


    public static boolean isOdd(int num)
    {

        return num % 2 != 0;

    }

    public static void printHelloWorld()
    {
        System.out.println("Hello World");
    }


    // using Euclidean Algorithm to calculate GCF (or GCD)
    public static int greatestCommonFactor(int num1, int num2)
    {
        int largeNum;
        int smallNum;
        if(num1 > num2)
        {
            largeNum = num1;
            smallNum = num2;
        }
        else
        {
            largeNum = num2;
            smallNum = num1;
        }
        while(true)
        {
            if(smallNum == 0)
            {
                break;
            }
            int prevSmall = smallNum;
            smallNum = largeNum % smallNum;
            largeNum = prevSmall;
        }
        return largeNum;
    }

    public static void main(String args[])
    {

        System.out.println("The number 3 is odd: " + isOdd(3));
        System.out.println("The number 4 is odd: " + isOdd(4));
        printHelloWorld();
        System.out.println("The Greatest Common Factor for 18 and 12 is: " + greatestCommonFactor(18, 12));
        System.out.println("The Greatest Common Factor for 20 and 15 is: " + greatestCommonFactor(20, 15));

    }
}
