import java.util.*;

public class palindrome

{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String data = new String();
        data = sc.nextLine();




        StringBuffer data_rev = new StringBuffer(data);
        data_rev = data_rev.reverse();
        if(data.equals(String.valueOf(data_rev)))
        {
            System.out.println("palindrome");
        }    
        else{
            System.out.println("not a palindrome");
        }
        
        
        // logical way

        int length = data.length()-1;
        int max = length/2;
        int count=0;
        for(int i=0;i<=max;i++)
        {
            if(data.charAt(i)!=data.charAt(length-i))
            {
                break;
            }
            else{
                count++;
            }
        }
        if(count==(max+1))
        {
            System.out.println("palindrome");  
        }
        else
        {
            System.out.println("not a palindrome");
        }







        sc.close();

        




    }
}