package FortuneCookie;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{

    public static void main(String[] args) throws IOException {

         try (ServerSocket server = new ServerSocket(12345)) {
            System.out.println("Waiting for connection on port 12345...");
             Socket socket = server.accept();
             System.out.println("Connection accepted");

             try (InputStream is = socket.getInputStream()) {
                BufferedInputStream bis = new BufferedInputStream(is);
                DataInputStream dis = new DataInputStream(bis);
                dis.readUTF();
                
            } catch (EOFException e) {
                socket.close();
                }
        }      
    }
   
}