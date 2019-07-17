import java.io.*;

public class copyUsingFH 
{
    public static void main(String[] args) throws Exception
    {
        int g= 0;
        //BufferedReader scan =  new BufferedReader(new InputStreamReader(System.in));
        File a = new File("copyUsingFH_reader.java");
        a.createNewFile();
        FileInputStream fis = new FileInputStream("copyUsingFH.java");
        DataInputStream dis = new DataInputStream(fis);

        FileOutputStream fos = new FileOutputStream(a);
        while(g!=-1)
        {
        g = dis.read();
        fos.write(g);
        }
    fos.flush();
    fos.close(); 
        //System.out.println(a);
    }

}