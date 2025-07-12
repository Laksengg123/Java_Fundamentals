package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");
        int n =  scan.nextInt();
        int[] arr =new int[n];

        System.out.println("enter the array elements");
        for(int i =0;i<n;i++)
        {
            arr[i]= scan.nextInt();
      }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i :arr)
        {
            System.out.print(i+" ");
        }



//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        }

    }

