package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        int count[] =  new int[n];
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i] == arr[j])
                {
                    count[i]++;
                }
            }
        }
        for(int i=0;i<6;i++)
        {
            if(count[i]==0)
            {
                System.out.println(arr[i]);
            }
        }
       // System.out.println(Arrays.toString(count));
    }
}
