import java.util.*;

public class wordCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String data = new String();
        data = sc.nextLine();
        int pos=0,value=1;
        pos = data.indexOf(" ");
        while (pos!=-1)
        {
            value++;
            pos = data.indexOf(" ",pos+1);
        }
       
        System.out.print(value);
        sc.close();
    }
   
}