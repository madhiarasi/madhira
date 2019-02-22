import java.io.*;
import java.util.*;
class factsing
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=1;
        for(int i=1;i<=n;i++)
        {
            m=m*i;
        }
        System.out.print(m);
    }
}
