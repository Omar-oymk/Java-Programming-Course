package Question_03;

/*
3. Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and
displays them in increasing order.
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        // first initialize an empty arraylist of integers
        ArrayList<Integer> arrayList = new ArrayList();

        // prompt the user to enter the numbers
        System.out.println("Please enter 5 numbers: ");
        // then loop
        for(int i = 0; i < 5; i ++)
        {
            arrayList.add((new Scanner(System.in)).nextInt());
        }

        // sort them
        Collections.sort(arrayList);
        // then display them
        System.out.println("ArrayList ordered ascendingly: ");
        for(Integer i : arrayList)
        {
            System.out.println(i);
        }
    }
}
