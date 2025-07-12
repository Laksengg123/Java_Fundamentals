package switch_statements;
import java.util.Scanner;
public class Receive_color {
    public static void main(String[] args)
    {
        Scanner scan =  new Scanner(System.in);
        char ch = scan.next().charAt(0);

        switch (ch) {
            case 'G':
                System.out.println("Green");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'R':
                System.out.println("Red");
                break;
            case 'W':
                System.out.println("White");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'O':
                System.out.println("Orange");
                break;

            default:
                System.out.println("Invalid code");
                break;
        }

    }
}
