import java.lang.*;
import java.io.*;
class ProcessDemo
{
    public static void main(String arg[]) throws IOException, Exception
    {
        System.out.println("Creating process");
              
        //creating process
        ProcessBuilder p = new ProcessBuilder(new String[] {"open", "/Applications/Facetime.app"});
        Process pro = p.start();
              
        //waiting for 10 second
        Thread.sleep(10000);
              
        System.out.println("destroying process");
              
        //destroying process
        pro.destroy();
    }
}
