package if_statement;
import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num > 0)
        {
            System.out.println("Positive Number");
        }
        else if(num < 0 )
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
