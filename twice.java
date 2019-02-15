import java.io.*;
import java.util.*;
class twice
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
        Arrays.sort(a);
        int c=0;
        int c1=0;
        for(int i=0;i<a.length;i=c1)
        {
            c=0;
            for(int j=i+1;j<a.length;j++)
            {
            if(a[i]==a[j])
            {
                c++;
                c1++;
            }
            else
            {
                c1++;
                break;
            }
            }
            //System.out.println(c);
           // System.out.println(a[i]);
        
            if(c==0)
            {
                
                System.out.print(a[i]);
                break;
            }
        }
    
    }
}

