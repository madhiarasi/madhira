import java.io.*;
import java.util.*;
class alpha
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
System.out.println("Alphabet");
else 
System.out.println("No");
}
}
