package com.seleniumexpress.beanlifecycle.annotation;

import javax.annotation.PostConstruct;
import java.sql.*;

public class StudentDao {

    private String driver;
    private String url;
    private String userName;
    private String password;

    Connection con;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @PostConstruct
    public void init() throws SQLException, ClassNotFoundException {
        createStudentDBConnection();
    }

    public void createStudentDBConnection() throws ClassNotFoundException, SQLException {

        // Load Driver
        Class.forName(driver);

        // Get a connection
        con = DriverManager.getConnection(url, userName, password);

    }

    public void closeConnection() throws SQLException {
        con.close();
    }

    public void selectAllRows() throws ClassNotFoundException, SQLException {
        try {
            // Execute query
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from esnew.hostelstudentinfo");

            while (rs.next()) {
                int studentID = rs.getInt(1);
                String studentName = rs.getString(2);
                String hostelFee = rs.getString(3);
                String foodType = rs.getString(4);
                System.out.println(
                        "Student ID = " + studentID + ", Student Name = " + studentName +
                                ", Hostel Fee = " + hostelFee + ", Food Type = " + foodType
                );
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteStudentRecord(int studentID) {
        try {
            // Execute query
            Statement stmt = con.createStatement();
            int rs = stmt.executeUpdate("delete from esnew.hostelstudentinfo where student_id = " + studentID);
            System.out.println("Deleted " + rs + " record with Student ID of " + studentID);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
