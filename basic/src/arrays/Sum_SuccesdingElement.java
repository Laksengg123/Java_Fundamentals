package arrays;

import java.util.Scanner;

public class Sum_SuccesdingElement
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i] =scan.nextInt();
        }
        int i=0;
        while(i<n)
        {
            if(arr[i] == 6)
            {
                i++;
                while(i<n && arr[i] !=7 )
                {
                    i++;
                }
                i++;
            }
            else {
                sum +=arr[i];
                i++;
            }
        }

        System.out.println(sum);
    }
}
