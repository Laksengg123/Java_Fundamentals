package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        int count=0;
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
         //   count++;
        }
        for(int i=0;i<n;i++)
        {
            sum = arr[i] + sum;
            System.out.println(sum);
        }
        sum = sum /n;
       // System.out.println("count"+count);
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}