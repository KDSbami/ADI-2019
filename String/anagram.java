import java.util.*;

public class anagram{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String data = new  String();
        String data2 = new  String();
        data = sc.next();
        data2 = sc.next();
        int arr[] = new int[26];
        int arr2[] = new int[26];
        int a =0;
        if(data.length()!=data2.length())
        {
            System.out.print("NOT AN ANAGRAM");
            return;
        }
        for(int i=0;i<data.length();i++)
        {
            a = data.charAt(i);
            arr[a-97]++;
            a = data2.charAt(i);
            arr2[a-97]++;

        }
        for(int i=0;i<26;i++)
        {
           if(arr[i]!=arr[i])
           {
               System.out.print("not an anagram");
               return;
           }
        }
        System.out.print("anagram");

        
    }
}
