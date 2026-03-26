package Lab_1.Question_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class AppendFile {
    public static void main (String [] args) {
        File file = new File ("Lab_1\\Question_1\\KorJingXiang_25005896.txt");
        try {
            PrintWriter outputStream = new PrintWriter ( new FileOutputStream (file,true));
            outputStream.println ("\n\nFriday, 26 June 2026.");
            outputStream.println ("I hope I am doing well in this course.");
            outputStream.println ("I am optimistic about my performance.");
            outputStream.println ("I learnt various data structures in this course.");
            outputStream.println ("My target does not change, which is to get an A in this course.");
            outputStream.println ("I can understand the course content well.");
            outputStream.println ("Perhaps solving some LeetCode exercises help me to excel better.");
            outputStream.close();
            System.out.println("Append successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e) {
            System.out.print("IOException: ");
            e.printStackTrace();
        }
    }
}
