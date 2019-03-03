import java.io.*;
import java.util.*;
class primesequense
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        for(int i=n+1;i<m;i++)
        {
            c=0;
            for(int j=i;j>=1;j--)
            {
            if(i%j==0)
            {
                c++;
            }
            }
        if(c==2)
        {
            System.out.print(i+" ");
        }
        }
    }
}
