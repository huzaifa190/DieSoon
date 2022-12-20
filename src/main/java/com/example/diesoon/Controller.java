package com.example.diesoon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller  implements Serializable, Initializable {

    @FXML
    public AnchorPane userRegisterAnchorPane,AddMedicineAnchorPane,dashBoardAnchorPane;
    @FXML
    public HBox dashboardHbox;
    @FXML
    public RadioButton radioButtonMale,radioButtonOther,radioButtonFemale;
    @FXML

    public TextField addUserPasswordField,addUserNameField,addFirstNameField,addLastNameField,addPhoneField;
    @FXML
    public TextField  medicineNameField,medicineIDField,companyNameField,priceField,quantityField;
    @FXML
    public DatePicker DOMField,DOEField;
    public AnchorPane viewMedicineAnchorPane;
    public TableView<Medicine> viewMedicineTableView;
    public TableColumn<Medicine, String> nameCoulumnOfTable;
    public TableColumn medIDCoulumnOfTableView;
    public TableColumn priceCoulumn;
    public TableColumn availabilityCoulumn;
    public TableColumn stockCoulumn;
    public TableColumn DOMcoulumn;
    public TableColumn DOEcoulumn;
    public Label totalMedLabel;
    @FXML
    private PasswordField PasswordField;
    @FXML
    private TextField usernameField,invalidField;
//    String css = Objects.requireNonNull(getClass().getResource("D:\\DieSoon\\src\\main\\java\\com\\example\\diesoon\\CSS.css")).toExternalForm();



    //   ------------------------------------------ METHODS -----------------------------------------------------




    // SignIn Button Method
    public void signIn() throws IOException, ClassNotFoundException {


        if (usernameField.getText().equals("admin") && PasswordField.getText().equals("0000")) {

            FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("/com/example/diesoon/Home.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Driver.getMainStage().setScene(scene);

        } else {

            ArrayList<User> users = fileWork.userFileRead("src/main/java/com/example/diesoon/Files/up.txt");

            String username = usernameField.getText();
            String password = PasswordField.getText();

            for (User u:
                 users) {
                System.out.println(u);
                if (u.getUserName().equals(username) && u.getPassword().equals(password)) {

                    FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("/com/example/diesoon/Home.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Driver.getMainStage().setScene(scene);
                    break;

                } else {
                    System.out.println("Invalid input");
                    invalidField.setVisible(true);
                    usernameField.setText("");
                    PasswordField.setText("");
                }
            }

        }
    }



    // Dash Board Menue Method
     public  void DashBoard(){

         dashBoardAnchorPane.setVisible(true);
        userRegisterAnchorPane.setVisible(false);
        AddMedicineAnchorPane.setVisible(false);
         viewMedicineAnchorPane.setVisible(false);

     }

                                  // Register User Menue Method
    public void RegisterUser() throws IOException {
//        ButtonEventMethods.addUser(dashboardHbox);
        ToggleGroup tg = new ToggleGroup();
        radioButtonFemale.setToggleGroup(tg);
        radioButtonMale.setToggleGroup(tg);
        radioButtonOther.setToggleGroup(tg);

        userRegisterAnchorPane.setVisible(true);
        dashBoardAnchorPane.setVisible(false);
        AddMedicineAnchorPane.setVisible(false);
        viewMedicineAnchorPane.setVisible(false);

    }

    // Method For AddMedicine Menue

    public  void AddMedicine(){
        dashBoardAnchorPane.setVisible(false);
        userRegisterAnchorPane.setVisible(false);
        viewMedicineAnchorPane.setVisible(false);
        AddMedicineAnchorPane.setVisible(true);
    }


                                // View Medicine Menue Method
    public  void viewMedicine () throws IOException, ClassNotFoundException {

//        fileWork.userFileRead()

        ArrayList <Medicine> medicines= fileWork.medicineFileRead("src/main/java/com/example/diesoon/Files/Medicines.txt");


        viewMedicineAnchorPane.setVisible(true);
        userRegisterAnchorPane.setVisible(false);
        AddMedicineAnchorPane.setVisible(false);
        dashBoardAnchorPane.setVisible(false);
        System.out.println("Medicines :");
    }

    // LogOut Button Method
     public  void lOgOut() throws IOException {

        ButtonEventMethods.logOut();
    }

    // Register user Button Method
    public  void Register() throws IOException {

        ButtonEventMethods.registerButton(addFirstNameField.getText(),addLastNameField.getText(),addPhoneField.getText(),addUserNameField.getText(),addUserPasswordField.getText());
        addUserPasswordField.setText("");
        addUserNameField.setText("");
        addFirstNameField.setText("");
        addLastNameField.setText("");
        addPhoneField.setText("");
        addUserNameField.setText("");
        userRegisterAnchorPane.setVisible(false);
        AddMedicineAnchorPane.setVisible(false);
        viewMedicineAnchorPane.setVisible(false);

        dashBoardAnchorPane.setVisible(true);

    }

    // Gender Selector Method
    public  void genderToggle(){

        ToggleGroup tg = new ToggleGroup();
        radioButtonFemale.setToggleGroup(tg);
        radioButtonMale.setToggleGroup(tg);
        radioButtonOther.setToggleGroup(tg);
    }

    //  cancelButtonOfAddUser Method
    public  void cancelButtonOfAddUser(){

        userRegisterAnchorPane.setVisible(false);
        AddMedicineAnchorPane.setVisible(false);
        viewMedicineAnchorPane.setVisible(false);
        dashBoardAnchorPane.setVisible(true);

    }

    //  cancelButtonOfAddMedicine Method
    public  void cancelButtonOfAddMedicine(){

        userRegisterAnchorPane.setVisible(false);
        AddMedicineAnchorPane.setVisible(false);
        viewMedicineAnchorPane.setVisible(false);
        dashBoardAnchorPane.setVisible(true);

    }

    // MEthod of  AddButtonOFAddMedicine
    public void  addButtonOfAddMedicine(){

        if(priceField.getText() != "" && quantityField.getText() != "")
        {
            double price = Double.parseDouble(priceField.getText());
            double quantity = Double.parseDouble(quantityField.getText());
            Medicine m = new Medicine(medicineNameField.getText(),medicineIDField.getText(),companyNameField.getText(),DOMField.getValue(),DOEField.getValue(),price,quantity);
            System.out.println(m);
            ButtonEventMethods.addMedicine( m);

        }



                medicineNameField.setText("");
                medicineIDField.setText("");
                companyNameField.setText("");
                priceField.setText("");
                quantityField.setText("");

        userRegisterAnchorPane.setVisible(false);
        AddMedicineAnchorPane.setVisible(false);
        AddMedicineAnchorPane.setVisible(false);
        dashBoardAnchorPane.setVisible(true);
        System.out.println("MEdicine Added!");


    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        try {
//            ArrayList <Medicine> medicines =  fileWork.medicineFileRead("src/main/java/com/example/diesoon/Files/Medicines.txt");
//            ObservableList<Medicine> ob = FXCollections.observableList(medicines);
//
////                nameCoulumnOfTable.setCellValueFactory(new PropertyValueFactory<>("medicineName"));
////                viewMedicineTableView.setItems(ob);
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }


    }
}