package com.java.filehandling.filehandling;

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
//        File file = new File("ArpitFolder");
//        file.mkdir();
//        file = new File("ArpitFolder\\Arpit.txt");
//        try{
//            file.createNewFile();
//            System.out.println("File created");
//        }
//        catch(IOException e)
//        {
//            System.out.println("Error occured while creating file");
//        }
//
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true)))
//        {
//            bw.write("Hello Arpit");
//            bw.write("Welcome");
//            bw.write("Writing in the file");
//            System.out.println("Write onto the file");
//            bw.close();  // as a best practice we close the bw
//        }
//        catch (IOException e)
//        {
//            System.out.println("Error occured while writing in file");
//        }
//
//        // for reading file
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("ArpitFolder\\Arpit.txt"));
//            String line;
//            System.out.println("Reading from file----");
//            while((line= br.readLine())!=null)
//            {
//
//                System.out.println(line);
//            }
//            br.close();
//        }
//        catch(FileNotFoundException e)
//        {
//            System.out.println("File not find exception");
//
//        }
//        catch (IOException e)
//        {
//            System.out.println("Input - Output file exception");
//        }

        // Reading file through Scanner
//        try {
//            Scanner sc = new Scanner(new File("ArpitFolder\\Arpit.txt"));
//            String line;
//            while(sc.hasNext())
//            {
//                line= sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        }
//        catch (FileNotFoundException e)
//        {
//            System.out.println("File not find exception");
//        }

        // delete a file
//        File file = new File("Mojojojo.txt");
//        if(file.delete())
//        {
//            System.out.println("Deletion successful");
//        }
//        else {
//            System.out.println("Error while deleting");
//        }

        







    }
}