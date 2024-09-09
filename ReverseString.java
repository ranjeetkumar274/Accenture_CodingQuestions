import java.util.Scanner;
public class ReverseString {

    static String reverse(StringBuilder sb){
        int n = sb.length();
        int i = 0;
        int j = n-1;
        while(i < j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb.toString();
    }
     static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String here : ");
        String s = sc.nextLine();
        System.out.print("Your updated reversed string is : ");

        StringBuilder sb = new StringBuilder(s);

        System.out.println(reverse(sb));

        sc.close();
    }
}
