import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    ServerSocket ss;
    Socket socket;
    BufferedReader buff;
    InputStreamReader isr;
    PrintWriter pw;

    public static void main(String[] args) throws IOException {
        MyServer obj = new MyServer();
        obj.ss = new ServerSocket(6541);
        System.out.println("Waiting for client");
        obj.socket = obj.ss.accept();
        System.out.println("Client Accepted");
        obj.isr = new InputStreamReader(obj.socket.getInputStream());
        obj.buff = new BufferedReader(obj.isr);
        obj.pw = new PrintWriter(obj.socket.getOutputStream(), true);
        System.out.println("Message from client " + obj.buff.readLine());
        obj.pw.println("Hi Client you data recieved !! Kewl");


    }
}