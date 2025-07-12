package looping;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Sum_OfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input =scan.nextInt();
        int sum = 0;
        for (; input > 0; input = input / 10)
        {
            int rem = input % 10;
            sum +=rem;
        }
        System.out.println(sum);
    }


}
