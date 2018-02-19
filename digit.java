import java.io.*;
import java.util.*;
class digit 
{ 	
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
int a=0,no;
no=sc.nextInt(); 
while(no>0)
{
no=no/10;
a++;
}
System.out.println(a);
}
}
