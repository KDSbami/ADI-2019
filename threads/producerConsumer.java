import java.util.*;

class Buffer 
{
    int data;
    void setData(int data)
    {
        this.data=data;
        System.out.println("data set");
       
    }

    int getData()
    {
        System.out.println("data get");
        return data;
    

        
    }   
} 

class producer extends Thread
{
    Buffer b;
    producer(Buffer b) 
    {
        try{
        this.b=b;
        Thread a =new Thread(this);
        a.start();}
        catch(Exception e){}
    }

    public void run()
    {
        int i=0;
        while(true)
        {
        b.setData(i);
        i++;
        }
    }
}

class consumer extends Thread
{
    Buffer b;
    consumer(Buffer b) 
    {
        try{
        this.b=b;
        Thread a =new Thread(this);
        a.start();
        }
        catch(Exception e){}
    }

    public void run()
    {
        
        while(true)
        {
        int x = b.getData();
        System.out.println(x);
        }
    }
}
public class producerConsumer
{
    public static void main(String[] args)
    {
        Buffer b = new Buffer();
        producer a = new producer(b);
        consumer c = new consumer(b);
    }
}