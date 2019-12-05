package com.jpmc.chat;

import com.google.gson.Gson;
import com.jpmc.model.Message;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

public class MessageDecoder implements Decoder.Text<Message> {

        public Message decode(String s) throws DecodeException {
        Gson gson = new Gson();
        Message message = gson.fromJson(s, Message.class);
        return message;
    }

    public boolean willDecode(String s) {
        return false;
    }

    public void init(EndpointConfig endpointConfig) {

    }

    public void destroy() {

    }
}
