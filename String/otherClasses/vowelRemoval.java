import java.util.*;


public class vowelRemoval
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String data = new String();
        data =  sc.next();
        StringBuffer sb = new StringBuffer(data);
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
            {
                sb.deleteCharAt(i);
                --i;
            }
           
        }
        data = sb.toString();
        System.out.println(data);
        sc.close();
    }
}