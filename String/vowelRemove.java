import java.util.*;

public class vowelRemoval
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String data = new String();
        data =  sc.next();
        StringBuffer sb = new StringBuffer(data);
        int Length = data.length();
        for(int i=0;i<Length;i++)
        {
            if(data.charAt(i)=='a'||data.charAt(i)=='e'||data.charAt(i)=='i'||data.charAt(i)=='o'||data.charAt(i)=='u')
            {
                sb.deleteCharAt(i);
                Length--;
            }
        }
        data = sb.toString();
        System.out.println(data);

    }
}