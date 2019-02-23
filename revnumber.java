import java.io.*;
import java.util.*;
class revnumber
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String m="";
        for(int i=s.length()-1;i>=0;i--)
        {
            m=m+String.valueOf(s.charAt(i));
        }
        System.out.print(m);
    }
}
