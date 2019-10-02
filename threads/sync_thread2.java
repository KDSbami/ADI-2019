/*
    Question 1
    5
    4
    3
    2
    1
    Question 2 
    5
    4
    3
    2
    1
    .
    .
    .
    .
*/

import java.java.util.*;

class q_print extends Thread
{
    int i=0;
    Boolean blocker = true;
q_print()
{
    try{
        Thread a = new Thread(this);
        a.start();
    }
    catch(Exception e){}
}
public void run()
{
    while(true)
    {
        if(blocker == true)
        {
            block_q();
        }
    }   
}

    synchronized block_q()
    {
        System.out.println("Question" + i);
        i++;
        blocker=false;
        notify();
        try
        {    
            wait();
        }
        catch(Exception e){}
    }
    synchronized block_c()
    {
        for(int j=5;j>0;j++)
        System.out.println(j);
        blocker=true;
        notify();
        try
        {    
            wait();
        }
        catch(Exception e){}
    }

}

class counter extends Thread
{
    
    counter()
    {
    q_print a = new q_print();
    
    }

   
} 

public class sync_thread2
{
    public static void main(String[] args)
    {

    }
}