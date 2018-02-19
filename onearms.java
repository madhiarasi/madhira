import java.io.*;
import java.util.*; 
class onearms
{
public static void main(String[] args)	 
{
int n,b,sum=0,cc;	
Scanner sc=new Scanner(System.in);	
n=sc.nextInt();	 
cc=n;	
while(n > 0)
{ b = n % 10;	 	 	
sum = sum + (b*b*b); 	
n = n / 10;
}
if(sum == cc)
{
System.out.print("Yes");
}
else
System.out.println("No"); 
}
}
