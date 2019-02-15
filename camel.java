import java.io.*;
import java.util.*;
class camel
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        String res="";
        String res1="";
        for(int i=0;i<s1.length;i++)
        {
            char ch[]=s1[i].toCharArray();
            for(int j=0;j<ch.length;j++)
            {
            if(j==0)
            {
             res=res+String.valueOf(ch[j]).toUpperCase();
            }
            else
            {
                res=res+String.valueOf(ch[j]);
            }
            }
            res1=res1+res+" ";
            res="";
        }
        System.out.print(res1);
    
    }
}

