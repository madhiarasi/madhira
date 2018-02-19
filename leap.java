import java.io.*;
import java.util.*;
class leap
{
public static void main(String args[])
{
int a;Scanner sc= new Scanner(System.in);
a=sc.nextInt(); if((a%400== 0)||(a%100!=0)&&(a%4==0))
{
System.out.println("Yes");
}
else
{
System.out.print("No");  
}
}
}
