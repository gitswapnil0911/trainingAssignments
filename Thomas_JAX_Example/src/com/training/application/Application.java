package com.training.application;

import com.training.client.BLZService;
import com.training.client.BLZServicePortType;
import com.training.client.DetailsType;

public class Application {

    public static void main(String[] args) {

        BLZService blz = new BLZService();

        BLZServicePortType proxy = blz.getBLZServiceSOAP11PortHttp();
        DetailsType val = proxy.getBank("13061028");
        System.out.println(val.getBezeichnung());

    }
}
