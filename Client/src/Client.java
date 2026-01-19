
import java.io.*;
import java.net.*;

public class Client {
    private Socket s = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    public Client(String addr, int port){

        //establish Connection
        try{
            s = new Socket(addr, port);
            System.out.println("Connected");

            //takes input from terminal
            in = new DataInputStream(System.in);

            //sends output to the socket
            out = new DataOutputStream(s.getOutputStream());
        }
        catch( UnknownHostException u){
           // u.printStackTrace();
            System.out.println(u);
            return;

        }
        catch(IOException io){
           // io.printStackTrace();
            System.out.println(io);
            return;
        }
        //String to read message from input
        String m = "";

        //keep reading untill "Over" is input

        while(!m.equals("Over")){
            try{
                m = in.readLine();
                out.writeUTF(m);
            }catch(IOException i){
                System.out.println(i);
            }
        }

        //close the connection
        try{
            in.close();
            out.close();
            s.close();
        }catch(IOException i){
            System.out.println(i);
        }


    }

    public static void main(String[] args) {
        Client c = new Client("127.0.0.1", 5000);

    }


}
