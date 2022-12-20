package com.example.diesoon;

import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;

import java.io.Serial;
import java.io.Serializable;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;

public class Medicine  implements  Serializable {

    @Serial
    private  static  final long serialVersionUID = 12L;
   private   String medicineName,medicineID,companyName;
    private LocalDate DOM,DOE;

   private double price,quantity;



    // Getters ANS Setters
    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getDOM() {
        return DOM;
    }

    public void setDOM(LocalDate DOM) {
        this.DOM = DOM;
    }

    public LocalDate getDOE() {
        return DOE;
    }

    public void setDOE(LocalDate DOE) {
        this.DOE = DOE;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


    // TOSTRING
    @Override
    public String toString() {
        return   medicineName + "/" + medicineID + "/"  + companyName  + "/" +DOM + "/" + DOE + "/" + price + "/" + quantity ;
    }

    //CONSTRUCTOR
    public Medicine(String medicineName, String medicineID, String companyName, LocalDate DOM, LocalDate DOE, double price, double quantity) {
        this.medicineName = medicineName;
        this.medicineID = medicineID;
        this.companyName = companyName;
        this.DOM = DOM;
        this.DOE = DOE;
        this.price = price;
        this.quantity = quantity;
    }




}

//¬í sr com.example.diesoon.UserrÏÇ¼GÝŽÏ L 	firstNamet Ljava/lang/String;L genderq ~ L 	lastNameeq ~ L passwordq ~ L phoneNumberq ~ L userNameq ~ xpt huzaifapt basharatt 123t 03000-918790t jutt@190sr com.example.diesoon.UserrÏÇ¼GÝŽÏ L 	firstNamet Ljava/lang/String;L genderq ~ L 	lastNameeq ~ L passwordq ~ L phoneNumberq ~ L userNameq ~ xpt sadaanpt hassant 111t 030000t
//sadaan@111sr com.example.diesoon.UserrÏÇ¼GÝŽÏ L 	firstNamet Ljava/lang/String;L genderq ~ L 	lastNameeq ~ L passwordq ~ L phoneNumberq ~ L userNameq ~ xpt tahapt juttt juttt
//0312423423423t
//chota@juttsr com.example.diesoon.UserrÏÇ¼GÝŽÏ L 	firstNamet Ljava/lang/String;L genderq ~ L 	lastNameeq ~ L passwordq ~ L phoneNumberq ~ L userNameq ~ xpt hamzapt alit hhht 3042312t hamza@hsr com.example.diesoon.UserrÏÇ¼GÝŽÏ L 	firstNamet Ljava/lang/String;L genderq ~ L 	lastNameeq ~ L passwordq ~ L phoneNumberq ~ L userNameq ~ xpt  pq ~ q ~ q ~ q ~ sr com.example.diesoon.UserrÏÇ¼GÝŽÏ L 	firstNamet Ljava/lang/String;L genderq ~ L 	lastNameeq ~ L passwordq ~ L phoneNumberq ~ L userNameq ~ xpt umairpt Arshadt hhhht 294239423-492343t hafiz@1
