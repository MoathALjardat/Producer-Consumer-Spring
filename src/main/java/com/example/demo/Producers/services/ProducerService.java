package com.example.demo.Producers.services;

import com.example.demo.databaseMethods.DatabaseMethods;

public class ProducerService {

    public static int getCount() {
        try {
            return DatabaseMethods.getNumberOfStudentsInStudentTable();
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public static double getAverage(int id) {
        try {
            return DatabaseMethods.getTheGpaForTheStudentById(id);
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

}
