import java.io.*;

public class copyUsingFH_reader 
{
    public static void main(String[] args) throws Exception
    {
        int g= 0;
        //BufferedReader scan =  new BufferedReader(new InputStreamReader(System.in));
        File a = new File("test.java");
        a.createNewFile();
        FileReader fis = new FileReader("copyUsingFH_reader.java");
        BufferedReader dis = new BufferedReader(fis);

        PrintWriter fos = new PrintWriter(a);
        while(g!=-1)
        {
        g = dis.read();
        fos.write(g);
        }
    fos.flush();
    fos.close(); 
    dis.close();
        //System.out.println(a);
    }

}