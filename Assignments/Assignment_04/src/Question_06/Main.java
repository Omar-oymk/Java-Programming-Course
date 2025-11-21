package Question_06;

/*
6. Write a program to create a file named Test.txt if it does not exist. Write 100 integers created
randomly into the file. Integers are separated by spaces in the file. Read the data back from the
file and display the data in increasing order.
 */

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) throws IOException
    {

        File file = new File("Text.txt");
        if(!file.exists())
        {
            file.createNewFile();
        }

        PrintWriter output = new PrintWriter("Text.txt");

        for(int i = 0; i < 100; i++)
        {
            output.print((new Random()).nextInt(100) + " ");
        }

        output.close();

        Scanner input = new Scanner(file);
        ArrayList<Integer> arrayList = new ArrayList();
        while(input.hasNext())
        {
            arrayList.add(input.nextInt());
        }
        input.close();

        // sort arraylist
        Collections.sort(arrayList);
        for(Integer i : arrayList)
        {
            System.out.print(i + " ");
        }
    }
}
