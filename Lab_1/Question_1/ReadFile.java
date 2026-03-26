package Lab_1.Question_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main (String [] args) {
        File file = new File ("Lab_1\\Question_1\\KorJingXiang_25005896.txt");
        try {
            Scanner inputStream=new Scanner (file);
            while (inputStream.hasNextLine()) {
                System.out.println(inputStream.nextLine());
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    
}
