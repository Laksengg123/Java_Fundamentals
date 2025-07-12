package arrays;
import java.util.Scanner;
public class Ascii_Value {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        for(int i :arr)
        {
            System.out.print((char)i);
        }

    }
}
