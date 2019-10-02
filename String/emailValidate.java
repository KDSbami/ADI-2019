import java.util.*;

public class emailValidate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String data = new String();
        data = sc.next();
        int count = data.length()-1;
        if(data.indexOf("@")==-1)
        {
            System.out.println("add @");
        }
        if(data.lastIndexOf(".")==-1||(data.lastIndexOf(".")!=count-3&&data.lastIndexOf(".")!=count-4))
        {
            System.out.println(data.indexOf("."));
            System.out.println("add .");
        }
    }
}