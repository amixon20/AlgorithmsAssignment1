import java.util.Scanner;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the total count of numbers in the array.");
        int s = scan.nextInt();
        System.out.println("Please enter the numbers of the array with a space in between each.");
        int[] nums = new int[s];
        for (int j = 0; j < nums.length; j++) {
            nums[j] = scan.nextInt();
        }
        System.out.println("Please enter the target value.");
        int val = scan.nextInt();
        System.out.println("New length: " + removeElement(nums, val));
    }
}
