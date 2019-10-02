import java.util.*;

class thread2 implements Runnable
{
    thread2(){
        Thread a = new Thread(this);
        a.start();

    }

    public void run()
    {
        try{
            System.out.println(thread.c);
        }
        catch(Exception e){}
    }
}

class thread1 implements Runnable
{
    thread1()
    {
    Thread a = new Thread(this);
    a.start();

    }
    public void run() 
    {
        try{
        for(int i=0;i<1000;i++){
        System.out.print("hello");
        thread.c++;
        thread2 b = new thread2();
        }
        }
        catch(Exception e){}
    }

}
public class thread
{
    public static int c = 0;
    public static void main(String[] args)
    {
       
        thread1 a = new thread1();
        
    }

}