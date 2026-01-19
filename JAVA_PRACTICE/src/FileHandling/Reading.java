package FileHandling;
import java.io.*;
public class Reading {
    public static void main(String[] args) throws Exception {
       /* FileReader reader = new FileReader("sample.txt");

        int ch;
        while((ch= reader.read()) != -1){
            System.out.print((char) ch);

        }
        reader.close();*/


        // BufferedRedaer reads line by line
       /* BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();*/

        //try with resources
        try( BufferedReader br1 = new BufferedReader(new FileReader("sample.txt"))){
            String line1;
            while((line1 = br1.readLine()) != null){
                System.out.println(line1);
            }
            br1.close();
        }

    }
}
