package if_statement;
import java.util.Scanner;
public class Variable_Char {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        char name = scan.next().charAt(0);
        if((name <= 'z' && name >= 'a') || (name <= 'Z' && name >= 'A'))
        {
            System.out.println("Alphabet");
        }
        else if(name >= '0' && name <= '9')
        {
            System.out.println("digit");
        }
        else {
            System.out.println("Special Character");
        }
    }
}
