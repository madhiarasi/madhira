import java.io.*;
import java.util.*;
class summ
{
public static void main(String args[])
{
int c,n,sum=0;
Scanner sc=new Scanner(System.in);
c=sc.nextInt();  
n=sc.nextInt();
int a[]=new int[c];
for(int i=0;i<c;i++) 
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
sum=sum+a[i];
}
System.out.println(sum);
}
}
