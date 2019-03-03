import java.io.*;
import java.util.*;
class holiday
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        if((s.equals("sunday"))||(s.equals("saturday")))
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
