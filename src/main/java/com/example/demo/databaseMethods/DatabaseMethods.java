package com.example.demo.databaseMethods;

import java.sql.*;

public class DatabaseMethods {

    public static int getNumberOfStudentsInStudentTable() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        int numberOfRecords = 0;
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/test", "root", "root1234");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM student;");
        rs.next();
        numberOfRecords += rs.getInt(1);

        con.close();
        return numberOfRecords;
    }

    public static double getTheGpaForTheStudentById(int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int count = 1;
            double res = 0;
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/test", "root", "root1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student;");
            while (rs.next() && count < id) {
                count++;
            }
            res = rs.getDouble(3);
            con.close();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return res;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }


}
