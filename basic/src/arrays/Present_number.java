package arrays;

import java.util.Scanner;

public class Present_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");
        int n =  scan.nextInt();
        int[] arr =  new int[n];
        System.out.println("Enter the target");
        int target = scan.nextInt();
        System.out.println("enter the array elements");
        for(int i =0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if(arr[i] == target)
            {
                System.out.println("Index"+" " +i);
            }
        }

    }
}
