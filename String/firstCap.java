import java.util.*;

public class firstCap{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String data = new  String();
        data = sc.nextLine();
        char x[]= new char[data.length()];
        x = data.toCharArray();
        int r = 'a'-'A';
        for(int i=0;i<data.length();i++)
        {
            if(data.charAt(i)==' ')
            {
                if(data.charAt(i+1)>96)
                {
                    x[i+1]=(char)(data.charAt(i+1)-r);
                }
            }
            if(i==0)
            {
                if(data.charAt(0)>96)
                {
                    x[0]=(char)(data.charAt(0)-r);
                }
            }
        }
        for(int i=0;i<data.length();i++)
        System.out.print(x[i]);


        data = x.toString();

        
    }
}