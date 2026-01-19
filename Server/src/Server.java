import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.net.*;

public class Server {

    //initialize socket and input stream

    private Socket s = null;
    private ServerSocket ss = null;
    private DataInputStream in = null;

    public Server(int port){
        //starts server  and waits for  connection

        try{
            ss = new ServerSocket(port);
            System.out.println("Server Started");

            System.out.println("Waiting for the clinet ......");

            s = ss.accept();
            System.out.println("CLient accepted");

            // take input from client

            in = new DataInputStream(new BufferedInputStream(s.getInputStream()));

            String m = "";

            //reads message from client untill "Over" is sent

            while(!m.equals("Over")){
                try{
                    m = in.readUTF();
                    System.out.println(m);
                }catch(IOException i){
                    System.out.println(i);
                }
            }
            System.out.println("Closing Connection");

            //close connection
            s.close();
            in.close();


        }catch(IOException un){
            System.out.println(un);
        }

    }

    public static void main(String[] args) {
        Server s = new Server(5000);
    }

}
