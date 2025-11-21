package Question_04;

/*
4. Write a program that removes all the occurrences of a specified string from a text file.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter a specific string that u want to remove from the text file: ");
        String input = (new Scanner(System.in)).nextLine();

        String filePath = "";
        String tempFilePath = "";
        File file = new File(filePath);

        // temporary file to write to cause the PrintWriter deletes the whole file that it opens
        File temp = new File(tempFilePath);

        // get both a scanner and a writer
        Scanner scan = new Scanner(file);
        PrintWriter write = new PrintWriter(temp);

        // ill use arraylist to hold each word as individual

        while(scan.hasNextLine())
        {
            String line = scan.nextLine();

            // edit the line then retype it in the file again
            line = line.replace(input, "");
            write.println(line);
        }

        // dont forget to close both
        scan.close();
        write.close();
    }
}
