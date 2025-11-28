import java.util.Arrays;

public class ArraysDemo {

public static void main(String[] args) {
int[] nums = new int[5];

display("Original array:", nums);

Arrays.fill(nums, 8);
display("After filling with 8s:", nums);

nums[2] = 6;
nums[4] = 3;
display("After changing two values:", nums);

Arrays.sort(nums);
display("After sorting:", nums);
}

public static void display(String message, int[] array) {
System.out.print(message + "\t");
for(int n : array) {
System.out.print(n + " ");
}
System.out.println();
}
}
