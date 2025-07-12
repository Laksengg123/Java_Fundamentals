package looping;
import java.util.Scanner;
import java.util.Arrays;
public class Prime_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int last = scan.nextInt();
        int count[] = new int[last];

        for(int i=first ;i <last;i++)
        {
            for(int j=2;j<=i;j++)
            {
                if(i%j == 0 )
                {
                    count[i]++;
                   // System.out.println("Value" +" "+i+" " +count[i]);
                }
            }
        }
        for(int i=first;i<last;i++)
        {
            if(count[i]==1)
            {
                System.out.println(i);
            }
        }



    }
}
