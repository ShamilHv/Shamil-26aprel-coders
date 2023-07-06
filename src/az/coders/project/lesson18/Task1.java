package az.coders.project.lesson18;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {

    public static void main(String[] args) {

        var file = new File("C:\\Users\\ACER NITRO 5\\Documents\\SHAMIL\\Coders\\Shamil-26aprel-coders\\src\\az\\coders\\project\\lesson18\\hi.txt");
        int lineCount = 0;

        try (BufferedReader read = new BufferedReader(new FileReader(file))) {
            while (read.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();


        };
        System.out.println(lineCount);

    }


}
