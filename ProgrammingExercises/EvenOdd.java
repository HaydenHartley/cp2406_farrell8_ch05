import java.util.Scanner;
public class EvenOdd
{
    public static void main(String args[])
    {
        int num;
        String output;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number\n>>>");
        num = input.nextInt();
        if (num % 2 == 0)
            output = (num + " is even");
        else
            output = (num + " is odd");
        System.out.println(output);
    }
}