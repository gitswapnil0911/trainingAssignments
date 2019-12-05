package com.jpmc.chat;

import com.google.gson.Gson;
import com.jpmc.model.Message;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class MessageEncoder implements Encoder.Text<Message> {

    public String encode(Message message) throws EncodeException {
        Gson gson = new Gson();
        String json = gson.toJson(message);
        return json;

    }

    public void init(EndpointConfig endpointConfig) {

    }

    public void destroy() {

    }
}
