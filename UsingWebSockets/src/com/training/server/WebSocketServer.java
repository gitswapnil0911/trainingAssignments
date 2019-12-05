package com.training.server;

import com.sun.xml.internal.ws.api.message.Message;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.nio.ByteBuffer;

@ServerEndpoint(value = "/wserver/{location}",decoders = {MyDecoder.class},encoders = {MyEncoder.class})
public class WebSocketServer {

    @OnOpen
    public void open(Session session){
        try {

            Partner part = new Partner();
            part.setPartnerName("Ramesh");
            part.setPartnerCode(101L);
            part.setMobileNumber(830802002L);
            session.getBasicRemote().sendObject(part);
            session.getBasicRemote().sendText("Hi we are connected start your chat");
            System.out.println("Connection opened");
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    @OnClose
    public void close(){

        System.out.println("Connection closed");

        /*try {
            session.getBasicRemote().sendText("Thanks for your time, Hope you enjoyed");
            System.out.println("Connection opened");
        }
        catch (Exception e){
            e.printStackTrace();
        }
*/

    }

    /*@OnMessage
    public String message(Session session, String message, @PathParam("location") String location){

        System.out.println(session.getId());

        System.out.println("message :=" + message);

        String response = "Welcome :" + message + "to "+location;

        return response;

    }*/
    @OnMessage
    public void handleMessage(Session session, String objctRef){

        System.out.println(objctRef);

    }

    @OnError
    public void error(Throwable e){

        e.printStackTrace();
        System.out.println("Error Occured");
    }

}
