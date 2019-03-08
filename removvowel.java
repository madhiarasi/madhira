import java.io.*;
import java.util.*;
class removvowel
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String h="";
        h=h+s.replaceAll("[aeiouAEIOU]","");
        StringBuffer sb=new StringBuffer(h).reverse();
        System.out.print(sb);
        
        
    }
}
