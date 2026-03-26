package Lab_1.Question_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main (String [] args) {
        File file = new File ("Lab_1\\Question_2\\text2.txt");
        try {
            Scanner inputStream = new Scanner (file);
            int count = 0;
            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                for (String word : line.split("[,;\\s]+")) {
                    count += word.length(); //a. Calculate the total number of characters in the file.
                    System.out.print(word); //b. Print the words in the file.
                }
                System.out.println();
            }
            System.out.println("Total characters: " + count);
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
