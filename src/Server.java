import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ThreadLocalRandom;

public class Server {
	private static Socket clientSocket;
    private static ServerSocket server;
    private static BufferedReader in;
    private static BufferedWriter out;
    private static String[] data = {"1","2","3","4","5"};

    public static void main(String[] args) {
    	
        try {
            try  {
                server = new ServerSocket(228);
                System.out.println("Сервер запущен!");
                clientSocket = server.accept();
                try {
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    
                    while(true) {
                        int randomNum = ThreadLocalRandom.current().nextInt(0, data.length);
                        out.write("Ваше рандомное число " + randomNum + "\n");
                        out.flush();
                    }
                } finally {
                    clientSocket.close();
                    in.close();
                    out.close();
                }
            } finally {
                    server.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
