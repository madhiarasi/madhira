import java.io.*;
import java.util.*;
class oddnum{ 	
public static void main(String args[])
{
int n,f, i;
Scanner sc=new Scanner(System.in);	 
n=sc.nextInt();	 
f=sc.nextInt();	 
for(i=n+1;i<f;i++)	 	
{ 	 	 
n=i;	 	 	 	 
if(n%2!= 0)
{ 	
System.out.print(n+" "); 
} 
}
}
}
