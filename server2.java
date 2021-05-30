import java.net.*;
import java.io.*;
import java.util.*;
class server2
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket s=new ServerSocket(5217);
        ServerSocket s1=new ServerSocket(3333);
        InetAddress ip;
        String hostname;
        while(true)
        {
            System.out.println("Waiting For Connection ...");
            Socket soc=s.accept();
            Socket soc2=s1.accept();
            DataOutputStream out=new DataOutputStream(soc.getOutputStream());
            out.writeBytes("Server Date: " + (new Date()).toString() + "\n");
            ip=InetAddress.getLocalHost();
            hostname=ip.getHostName();
            DataOutputStream out2=new DataOutputStream(soc2.getOutputStream());
            out2.writeBytes("IP Address ::  "+ip);
            out2.writeBytes("HostName ::  "+hostname);
            out.close();
            soc.close();
            out2.close();
            soc2.close();
        }
    }
}