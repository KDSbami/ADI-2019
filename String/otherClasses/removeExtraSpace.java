import java.util.*;

public class removeExtraSpace{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String data = new String();
        data = sc.nextLine();
        data = data.trim();
        StringBuffer sb = new StringBuffer(data);
        boolean flag = false;

        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)==' ' && flag == true)
            {
                sb.deleteCharAt(i);
                i--;
            }

            if(!(sb.charAt(i)==' '))
            {
                flag = false;
            }
            else
            {
                flag = true;
            }
            
        }
        data = sb.toString();

        System.out.print(data);
    }
}