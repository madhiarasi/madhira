import java.io.*;
import java.util.*;
class primeseq
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        String s="";
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
                s=s+String.valueOf(i+" ");
            }
        }
        System.out.print(s);
    }
}
