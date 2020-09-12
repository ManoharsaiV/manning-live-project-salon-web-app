package com.salon.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;


public class JdbcTest {

    public String welcome(){

        Connection driverManager = null;

        try{
            driverManager = DriverManager.getConnection("jdbc:postgresql://localhost:5432/salon", "work", "work");
            System.out.println("connection successful");


        }catch (Exception e){
            e.printStackTrace();
        }






        return "welcome";
    }


}
