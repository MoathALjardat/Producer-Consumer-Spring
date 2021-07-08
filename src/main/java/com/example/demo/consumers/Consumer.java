package com.example.demo.consumers;

import com.example.demo.requset.RequestsAndResponses;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Consumer{

    private Thread thread;
    private int id;

    public Consumer(int id) {
        this.id = id;
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    double gpa = RequestsAndResponses.requestForGpa(id);
                    System.out.println("Thread #" + id + " its the average for student #" + id + " and the average is " + gpa);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }

    public void sendToProducer ()
    {
     this.thread.start();
    }


}
