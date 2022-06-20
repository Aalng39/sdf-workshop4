package FortuneCookie;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        
        System.out.println("Connecting to localhost at port 12345");

        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connected.");

        try (OutputStream os = socket.getOutputStream()) {
            BufferedOutputStream bos = new BufferedOutputStream(os);
            DataOutputStream dos = new DataOutputStream(bos);
            dos.writeUTF("hello, world");
            dos.flush();
        }
        socket.close();
    }
    
}
