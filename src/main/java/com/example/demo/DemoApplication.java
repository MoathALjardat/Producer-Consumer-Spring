package com.example.demo;
import com.example.demo.Threads.MoathThread;
import com.example.demo.requset.MoathRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);

		int numberOfRecords = MoathRequest.requestForCount();

		ArrayList<MoathThread> ar = new ArrayList<>();

		for (int i = 0 ; i < numberOfRecords ; i++)
		{
			ar.add(new MoathThread(i+1));
		}

		for (int i = 0 ; i < numberOfRecords ; i++)
		{
			ar.get(i).thread.start();
		}
	}
}
