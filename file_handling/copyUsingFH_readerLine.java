import java.io.*;

public class copyUsingFH_readerLine 
{
    public static void main(String[] args) throws Exception
    {
        int g= 0;
        //BufferedReader scan =  new BufferedReader(new InputStreamReader(System.in));
        File a = new File("test.java");
        a.createNewFile();
        FileReader fis = new FileReader("copyUsingFH_reader.java");
        BufferedReader dis = new BufferedReader(fis);
        String x = "";
        PrintWriter fos = new PrintWriter(a);
        while((x=dis.readLine())!=null)
        {
        fos.write(x);
        }
    fos.flush();
    fos.close(); 
    dis.close();
        //System.out.println(a);
    }

}