package com.training.client;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configuration;
import java.security.KeyStore;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) {

        ClientBuilder builder = ClientBuilder.newBuilder();

        WebTarget target = builder.build().target("http://localhost:8069/DoctorManagement_war_exploded/");

        String resp = target.path("/webapi/medicine").request().get(String.class);

        System.out.println("Response From Server"+resp);
    }
}
