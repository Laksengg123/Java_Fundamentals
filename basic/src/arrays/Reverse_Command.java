package arrays;
import java.util.Arrays;
public class Reverse_Command {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");

        }

        int[][] arr =  new int[2][2];
        int k =0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j] = Integer.parseInt(args[k++]);
            }
        }

        int arr1[] = new int[4];
        int l=0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr1[l++] = arr[i][j];
            }
        }
        int start = 0;
        int end = arr1.length-1;


        while(start < end)
        {
            int temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr1));



    }
}
