import java.io.*;
import java.util.*;
class romannume
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,String>map=new LinkedHashMap<Integer,String>();
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");
        String s="";
        for (Map.Entry<Integer, String> entry : map.entrySet())
        {
         int key=entry.getKey();
         if(n/key!=0)
         {
         for(int i=0;i<(n/key);i++)
         {
            s=s+map.get(key);
         }
          n = n % key;
         }
        }
     System.out.print(s);
    }
}
