import java.io.*;
import java.util.*;
class primesin
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
