import java.io.*;
import java.util.*;
class rev
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String n="";
        for(int i=s.length()-1;i>=0;i--)
        {
            n=n+""+s.charAt(i);
        }
        System.out.print(n);
    }
}
