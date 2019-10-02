import java.io.*;


class b implements Serializable
{
    b()
    {
        int a =10;
        String b= "hi";
    }

}


public class serialization {
    public static void main (String[] args) throws Exception
    {
        File a = new File("a.dat");
        a.createNewFile();

        b x = new b();
        ObjectOutputStream oop = new ObjectOutputStream(new FileOutputStream(a));
        
        oop.writeObject(x);
        oop.flush();
        oop.close();
    }
}
