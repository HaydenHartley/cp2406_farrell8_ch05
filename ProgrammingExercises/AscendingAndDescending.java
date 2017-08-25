import java.util.Collections;
import java.util.Scanner;
public class AscendingAndDescending
{
    public static void main(String args[])
    {
        int[] nums =  new int[3];
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
        Integer[] nums1 = new Integer[nums.length];
        for (int i=0; i < nums.length; i++)
        {
            nums1[i] = nums[i];
        }
        java.util.Arrays.sort(nums1, Collections.reverseOrder());
        System.out.println("Decsending Order is:");
        for (int num : nums1)
        {
            System.out.println(num);
        }
    }
}