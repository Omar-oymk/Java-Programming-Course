package Question_05;

/*
5. Write a program that will count the number of characters, words, and lines in a file. Whitespace
characters separate words. Filename should be input to the program.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter the full path or the relative path to the file: ");
        String filePath = (new Scanner(System.in)).nextLine();

        File file = new File(filePath);

        int characterCount = 0, wordCount = 0, lineCount = 0;

        // create a scanner for the file
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine())
        {
            String line = scan.nextLine();
            lineCount++;

            // split returns an array of words after splitting
            // replace returns full string after replacing (in this case we are deleting)
            characterCount += line.replace(" ", "").length();
            wordCount += line.split(" ").length;
        }

        scan.close();

        System.out.println("Total words: " + wordCount);
        System.out.println("Total characters: " + characterCount);
        System.out.println("Total lines: " + lineCount);
    }
}
