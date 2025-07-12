package if_statement;
import java.util.Scanner;
public class Char_Var {
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        char ch =  scan.next().charAt(0);

        if(ch >= 'a' && ch <= 'z')
        {
            char up = (char)(ch - 32) ;
            System.out.println(up);
        }
        else
        {
            char lo = (char)(ch + 32);
            System.out.println(lo);
        }
    }
}
