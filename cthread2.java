import java.io.*;
import java.net.*;
import java.util.*;
public class cthread2{
    public static void main(String args[]) throws IOException{
        try{
            Scanner sc=new Scanner(System.in);
            InetAddress ip=InetAddress.getByName("localhost");
            Socket s=new Socket(ip,5056);
            DataInputStream dis = new DataInputStream(s.getInputStream()); 
            DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
            while(true){
                System.out.println(dis.readUTF());
                String send=sc.nextLine();
                dos.writeUTF(send);
                if(send.equals("Exit")){
                    System.out.println("Terminating Connection :: "+s);
                    s.close();
                    System.out.println("Connection closed");
                    break;
                }
                String rec=dis.readUTF();
                System.out.println("Server Says ::  " +rec);
            }
            sc.close();
            dis.close();
            dos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}