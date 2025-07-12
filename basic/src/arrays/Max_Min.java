package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr =  new int[n];

        for(int i =0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        int max =arr[0];
        int min =arr[0];
        for(int i =1;i<n;i++)
        {
            if(arr[i] >max)
            {
                max = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum"+max);

      System.out.println("Minimum"+min);

    }
}
