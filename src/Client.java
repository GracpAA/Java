import java.io.*;
import java.net.Socket;
import java.util.concurrent.ThreadLocalRandom;

public class Client {

    private static Socket clientSocket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static BufferedWriter out;
    

    public static void main(String[] args) {
        try {
            try {
                clientSocket = new Socket("localhost", 228);
                reader = new BufferedReader(new InputStreamReader(System.in));
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                while(true) {
                	
                    String word = reader.readLine();
                    out.write(word + "\n");
                    out.flush();
                    String serverWord = in.readLine();
                    System.out.println(serverWord);
                }
            } finally {
                clientSocket.close();
                in.close();
                out.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
