import java.io.*;
import java.util.*;
class repti
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuffer sb=new StringBuffer(s);
        System.out.print((sb.reverse()).toString());
    }
}
