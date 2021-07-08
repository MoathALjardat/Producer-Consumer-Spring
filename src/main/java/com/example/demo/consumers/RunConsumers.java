package com.example.demo.consumers;

import com.example.demo.requset.RequestsAndResponses;

import java.io.IOException;
import java.util.ArrayList;

public class RunConsumers {


    public static void runConsumers() throws IOException {
        int numberOfRecords = RequestsAndResponses.requestForCount();

        ArrayList<Consumer> ar = new ArrayList<>();

        for (int i = 0; i < numberOfRecords; i++) {
            ar.add(new Consumer(i + 1));
        }

        for (int i = 0; i < numberOfRecords; i++) {
            ar.get(i).sendToProducer();
        }
    }

}
