package com.example.diesoon;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;

import java.io.*;
import java.util.Date;

public class ButtonEventMethods {




        // Method for Register Button
    public  static void registerButton(String fName,String lName,String phone,String uName , String password) throws IOException {

       User user1 = new User(fName,lName,phone,uName,password);


        fileWork.UserFileWrite(user1,"src/main/java/com/example/diesoon/Files/up.txt");


    }

                                 // Add Medicine Button  Method
    public static void addMedicine(Medicine m){

        fileWork.UserFileWrite(m,"src/main/java/com/example/diesoon/Files/Medicines.txt");
    }






    // Method For LogOut
    public  static  void logOut() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("LoginIn.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Driver.getMainStage().setScene(scene);
//        System.out.println("Logged Out");
    }
}
