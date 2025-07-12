package if_statement;
import java.util.Scanner;
public class Accept_Gen {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        String gender = scan.next();
        if((num >0 && num <=58) && (gender.equals( "F")))
        {
            System.out.println("8.2%");
        }
        else if((num >58 && num <=100) && (gender.equals( "F")))
        {
            System.out.println("9.2%");
        }
        else if((num >0 && num <=58) && (gender.equals( "M")))
        {
            System.out.println("8.4%");
        }
        else if((num >58 && num <=100) && (gender.equals( "M")))
        {
            System.out.println("10.5%");
        }
    }
}
