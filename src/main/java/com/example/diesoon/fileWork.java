package com.example.diesoon;

import java.io.*;
import java.util.ArrayList;

public class fileWork implements Serializable {



                                  // Method For Reading Uses Data From File
    public  static  ArrayList<User> userFileRead(String fileName) throws IOException, ClassNotFoundException {

        ArrayList<User> users = new ArrayList<>();
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        while (fis.available() > 0  ) {
            users.add((User) ois.readObject());
        }
        ois.close();
        fis.close();
        return  users;

    }


                                // Method For Writing Objects To File
    public static <T>void UserFileWrite(T u,String filePath) {

        File f = new File(filePath);
        FileOutputStream fos;

        try {

            if( f.length() == 0){
                 fos = new FileOutputStream( f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(u);
//                oos.flush();
                oos.close();

                System.out.println("User Registered");

            }
            else {

                 fos = new FileOutputStream( f,true);
                MyObjectOutputStream oos = new MyObjectOutputStream(fos);
                oos.writeObject(u);
                System.out.println("User Registered1111");


                oos.close();

            }

            fos.close();

        }

        catch (IOException e){
            throw  new RuntimeException(e);
//            e.printStackTrace();
        }
    }


    public  static  ArrayList<Medicine> medicineFileRead(String fileName) throws IOException, ClassNotFoundException {

        File f = new File(fileName);
        ArrayList<Medicine> medicines = new ArrayList<Medicine>();

        FileInputStream fis = new FileInputStream(f);
//        System.out.println("HERE");
        ObjectInputStream ois = null;



        while (f.length() >0 && fis.available() > 0  ) {
            ois = new ObjectInputStream(fis);
            medicines.add((Medicine) ois.readObject());
        }
        assert ois != null;
        ois. close();

        fis.close();
        return  medicines;

    }

//    file:/C:/Users/home/Pictures/Saved%20Pictures/userIcon.jpg
}
