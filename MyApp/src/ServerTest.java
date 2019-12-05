import java.net.*;
import java.io.*;
import java.util.StringTokenizer;

public class ServerTest {
    public static void main(String[] args) throws Exception {
        try {
            ServerSocket server = new ServerSocket(6547);
            int counter = 0;
            System.out.println("Server Started ....");
            while (true) {
                counter++;
                Socket serverClient = server.accept();  //server accept the client connection request
                System.out.println(" >> " + "Client No:" + counter + " started!");
                ServerClientThreadTest sct = new ServerClientThreadTest(serverClient, counter); //send  the request to a separate thread
                sct.start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class ServerClientThreadTest extends Thread {
    Socket serverClient;
    int clientNo;
    int squre;

    ServerClientThreadTest(Socket inSocket, int counter) {
        serverClient = inSocket;
        clientNo = counter;
    }

    public void run() {
        try {
            DataInputStream inStream = new DataInputStream(serverClient.getInputStream());
            DataOutputStream outStream = new DataOutputStream(serverClient.getOutputStream());
            String clientMessage = "", serverMessage = "";
            while (!clientMessage.equals("bye")) {
                clientMessage = inStream.readUTF();
                System.out.println("From Client-" + clientNo + ": String is :" + clientMessage);
                StringTokenizer st = new StringTokenizer(clientMessage, " ");
                StringBuilder str = new StringBuilder();
                while (st.hasMoreTokens()) {
                    if (str.equals("null") || str.length()!=3){
                        str.append(st.nextToken() + ",");
                        System.out.println(str.length());
                    }
                    else
                        str.append(st.nextToken());
                }
                serverMessage = "From Server to Client-" + clientNo + ": String is :" + str;
                outStream.writeUTF(serverMessage);
                outStream.flush();
            }
            inStream.close();
            outStream.close();
            serverClient.close();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Client -" + clientNo + " exit!! ");
        }
    }
}