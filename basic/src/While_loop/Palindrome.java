package While_loop;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp = num;
        int ans =0;
        while (temp >0)
        {
            int rem = temp%10;
            ans =ans *10+rem;
            temp = temp /10;
        }
        System.out.println(ans);
        System.out.println(num);
        if (ans == num)
        {
            System.out.println("Palindrom");
        }
        else {
            System.out.println("Not a Palindrom");
        }
    }
}
