package com.java.serialization.serialiazation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("bike",9999);
        Vehicle car = new Vehicle("car",0001);

        try(FileOutputStream fos = new FileOutputStream("Arpit.txt")) {
            try(ObjectOutputStream obj = new ObjectOutputStream(fos))
            {
                obj.writeObject(bike);
                obj.writeObject(car);
                System.out.println("Object written in the file");
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        } ;

    }
}
