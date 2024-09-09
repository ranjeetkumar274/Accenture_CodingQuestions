import java.util.Scanner;
public class MaximumElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of array : ");
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        for(int x : nums){
            System.out.print(x+",");
        }
        System.out.println();

        int max = Integer.MIN_VALUE;
        for(int j = 0; j < n; j++){
            if(max < nums[j]){
                max = nums[j];
            }
        }
        System.out.print("The max integer of this array is : ");
        System.out.print(max);
    }
}
