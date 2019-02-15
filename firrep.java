import java.io.*;
import java.util.*;
class firrep
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
            if(a[i]==a[j])
            {
                c++;
            }
            }
            if(c>0)
            {
                
                System.out.print(a[i]);
                break;
            }
        }
        if(c==0)
        {
            System.out.print("unique");
        }
    
    }
}

