package com.example.demo.Threads;

import com.example.demo.requset.MoathRequest;

public class MoathThread {

    public Thread thread;
    int theNumber;

    public MoathThread(int theNumber) {
        this.theNumber = theNumber;
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    double gpa = MoathRequest.requestForGpa(theNumber);
                    System.out.println("Thread #" + theNumber + " its the average for student #" + theNumber + " and the average is " + gpa);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }

}
