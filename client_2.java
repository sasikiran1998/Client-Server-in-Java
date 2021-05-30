import java.io.*;
import java.net.*;
import java.util.*;
class client_2
{
    public static void main(String args[]) throws Exception
    {
        Socket soc2=new Socket(InetAddress.getLocalHost(),3333);        
        BufferedReader in=new BufferedReader(new InputStreamReader(soc2.getInputStream()  ));
        System.out.println(in.readLine());
    }    
}