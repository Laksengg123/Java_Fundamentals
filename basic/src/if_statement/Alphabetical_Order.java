package if_statement;
import java.util.Scanner;
public class Alphabetical_Order {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);//e 102
        char b = scan.next().charAt(0);// a 97
        if(a > b) //102 < 97
        {
            char temp = a;
            a= b;
            b = temp;
        }
        System.out.println(a+" "+ b);
    }
}
