import java.util.*;
class buffer{
    synchronized void display()
    {
        System.out.print("hello");
        
        try{
        Thread.sleep(500); 
        System.out.println(" world");    
        }
        catch(Exception e){}
    }
}

class thread1 extends Thread
{
    buffer b;
    thread1(buffer b)
    {
        this.b = b;
        Thread a =new Thread(this);
        a.start();
    }
    public void run()
    {
        b.display();
    }
}

public class synchronization{
    public static void main(String[] args)
    {
        buffer b = new buffer();

        thread1 a = new thread1(b);
        thread1 bb = new thread1(b);
    }
}