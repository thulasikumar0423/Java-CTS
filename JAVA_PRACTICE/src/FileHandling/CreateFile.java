package FileHandling;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        FileWriter writer = new FileWriter("sample.txt");
        writer.write("Hello , File handling in java \n" +
                "Process finished with exit code 0\n ");
        writer.close();
        System.out.println("Dta written");
        if (file.createNewFile()) {

            System.out.println("File Created");
        } else{
            System.out.println("File already exists");
        }
    }
}
