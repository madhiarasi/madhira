import java.io.*;
import java.util.*;
class shift
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(k>0)
            {
            for(int j=i+1;j<a.length;j++)
            {
                int t;
                t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                k--;
                break;
            }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}
