import java.util.Scanner;
public class SecondMaximumElemeent {
   public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        for(int x : nums){
            System.out.print(x+",");
        }

        System.out.println();

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int j = 0; j < n; j++){
            if( nums[j]>max){
                max2 =max;
                max = nums[j];
            }else if(nums[j]>max2 && nums[j]!=max){
                max2 = nums[j];
            }
        }
        System.out.println("second maximum of nums array: "+max2);
    }
}
