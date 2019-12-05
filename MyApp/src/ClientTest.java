import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) throws Exception {
        try{
            Socket socket=new Socket("127.0.0.1",6547);
            DataInputStream inStream=new DataInputStream(socket.getInputStream());
            DataOutputStream outStream=new DataOutputStream(socket.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String name="",email="",contact="",serverMessage="";
            while(!name.equals("bye") && !email.equals("bye") && contact.equals("bye")){
                System.out.println("Enter Name :");
                StringBuilder str
                        = new StringBuilder();
                name=br.readLine();
                str.append(name);
                System.out.println("Enter email :");
                email=br.readLine();
                str.append(" "+email);
                System.out.println("Enter contact :");
                contact=br.readLine();
                str.append(" "+contact);
                outStream.writeUTF(String.valueOf(str));
                outStream.flush();
                serverMessage=inStream.readUTF();
                System.out.println(serverMessage);
            }
            outStream.close();
            outStream.close();
            socket.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
