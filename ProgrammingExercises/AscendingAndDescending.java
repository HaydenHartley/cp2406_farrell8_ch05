import java.util.Collections;
import java.util.Scanner;
public class AscendingAndDescending
{
    public static void main(String args[])
    {
        Integer[] nums =  new Integer[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        nums[0] = input.nextInt();
        System.out.println("Enter second integer: ");
        nums[1] = input.nextInt();
        System.out.println("Enter last integer: ");
        nums[2] = input.nextInt();
        java.util.Arrays.sort(nums);
        System.out.println("Ascending Order is:");
        for (int num : nums)
        {
            System.out.println(num);
        }
        java.util.Arrays.sort(nums, Collections.reverseOrder());
        System.out.println("Decsending Order is:");
        for (int num : nums)
        {
            System.out.println(num);
        }
    }
}