import java.io.*;
import java.util.*;
class arms
{
public static void main(String args[])
{ 	 	int n,f, i, b, sum = 0; 	 	
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
f=sc.nextInt();
for(i = n; i <= f; i++) 
{ 	 	
n = i;	
while(n > 0) 
{ 
b = n % 10;
sum = sum +(b*b*b);
n = n / 10;	 
}
if(sum == i) 
{
System.out.print(i+" ");
}
sum=0;
}
}
}
