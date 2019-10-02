import java.util.*;

public class countDuplicates{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String data = new String();
        data = sc.next();
        int arr[] = new int[26];
        int a ='a';
        for(int i=0;i<data.length();i++)
        {
            arr[data.charAt(i)-a]++;
        }
        for(int i=0;i<26;i++)
        {
            if(!(arr[i]==0))
            {
                System.out.println((char)(i+a)+" = "+arr[i]);
            }
        }


    }
}