import java.io.*;
import java.util.*;
class primeseq1
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        int g=0;
        for(int i=n;i<=m;i++)
        {
            c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                g++;
            }
        }
        System.out.print(g);
    }
}
