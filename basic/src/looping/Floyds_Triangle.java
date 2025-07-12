package looping;
import java.util.Scanner;
public class Floyds_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 3;// scan.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j =i+1;j<=n; j++) {
                System.out.print(j+"");

            }
            System.out.println(" ");
        }
    }
    }
