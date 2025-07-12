package arrays;

public class Biggest_number
{
    public static void main(String[] args) {
        int[][] arr =  new int[3][3];
        int k=0;
        int max =0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j] = Integer.parseInt(args[k]);
                if(arr[i][j] >max )
                {
                    max = arr[i][j];
                }
                k++;
            }
        }
        System.out.println(max);
    }
}
