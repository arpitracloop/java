package com.java.filehandling.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HelloApplication
{
    public static void main(String[] args) throws IOException {
        // creating file in java
//        File file = new File("Mojojojo.txt");
//        file.createNewFile();
//        System.out.println("File is created");
//
//

        // create directory
//        File directory = new File("arpitDirectory");
//        directory.mkdir();
//        System.out.println("Directory created");
//
        //to create sub directories
//        File directory = new File("arpit\\1 level\\2 leve");
//        directory.mkdirs();
//        System.out.println("Directories are created");

        //writing content in the file
        File file = new File("ArpitFolder");
        file.mkdir();
        file = new File("ArpitFolder\\Arpit.txt");
        try{
            file.createNewFile();
            System.out.println("File created");
        }
        catch(IOException e)
        {
            System.out.println("Error occured while creating file");
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file)))
        {
            bw.write("Hello Arpit");
            bw.write("Welcome");
            bw.write("Writing in the file");
            System.out.println("Write onto the file");
        }
        catch (IOException e)
        {
            System.out.println("Error occured while writing in file");
        }





    }
}