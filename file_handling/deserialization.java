import java.io.*;

public class deserialization{
    public static void main(String[] args) throws Exception
    {
        File f = new File("a.dat");
        ObjectInputStream r = new ObjectInputStream(new FileInputStream(f));

        b g = null;
        g = (b)r.readObject();

        System.out.print(g.a);
        
    }
}