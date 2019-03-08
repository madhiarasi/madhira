import java.io.*;
import java.util.*;
class sumofsquares
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int y=0;
        for(int i=0;i<s.length();i++)
        {
            int k=Integer.parseInt(String.valueOf(s.charAt(i)));
            y=y+k*k;
        }
            System.out.print(y);
        
        
    }
}
