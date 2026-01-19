package FileHandling;
import java.io.*;
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        if(file.delete()){
            System.out.println("File Deleted");
        }
    }
}
