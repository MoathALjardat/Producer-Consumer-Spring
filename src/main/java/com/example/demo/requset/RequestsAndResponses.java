package com.example.demo.requset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class RequestsAndResponses {

    public static int requestForCount() throws IOException {

        URL url = new URL("http://localhost:9191/count");
        URLConnection yc = url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        yc.getInputStream()));
        String inputLine;

        int count = 0;
        while ((inputLine = in.readLine()) != null)
            count = Integer.parseInt(inputLine);
        in.close();
        return count;
    }


    public static double requestForGpa(int id) throws IOException {

        URL url = new URL("http://localhost:9191/getGpa/" + id);
        URLConnection yc = url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        yc.getInputStream()));
        String inputLine;

        double gpa = 0;
        while ((inputLine = in.readLine()) != null)
            gpa = Double.parseDouble(inputLine);
        in.close();
        return gpa;

    }

}
