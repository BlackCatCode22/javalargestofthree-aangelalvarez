import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        int[] nums = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, this program wil find the largest of three numbers :)");
        System.out.println("Enter the first number:");
        nums[0] = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number:");
        nums[1] = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the third number:");
        nums[2] = Integer.parseInt(scanner.nextLine());
        int largest = nums[0];
        for (int i = 0; i < 3; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.println("The largest number is " + largest);
        System.out.println("The sum of the numbers is " + (nums[0] + nums[1] + nums[2]));
    }
}