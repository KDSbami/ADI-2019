import java.util.*;

public class caseChange
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String data = new String();
        data = sc.next();
        StringBuffer sb = new StringBuffer(data);
        int adder = 'a'-'A';
        
        for(int i=0;i<sb.length();i++)
        {
            
            int val = (int)data.charAt(i);
            if(val>='a'&&val<='z')
            sb.setCharAt(i, (char)(val-adder));
        }
        data = sb.toString();
        System.out.print(data);

    }
}