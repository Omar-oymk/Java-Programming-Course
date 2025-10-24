/*
3. Write the following method that sorts an ArrayList of numbers:
public static void sort(ArrayList<Integer> list)
 */

package Question_03;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(2);
        arr.add(7);
        arr.add(1);
        arr.add(9);
        arr.add(10);
        arr.add(5);

        System.out.println(arr);

        mergeSort(arr);

        System.out.println(arr);
    }

    static void mergeSort(ArrayList<Integer> arr)    // merge sort (O(nlog(n) approach)
    {
        // base case
        if(arr.size() <= 1) return;


        // split the arraylist
        ArrayList<Integer> left = new ArrayList<>(arr.subList(0, arr.size() / 2));
        ArrayList<Integer> right = new ArrayList<>(arr.subList(arr.size() / 2, arr.size()));
        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    static void merge(ArrayList<Integer> arr, ArrayList<Integer> left, ArrayList<Integer> right)
    {
        int i = 0, j = 0, k = 0;

        // keep comparing between both left and right
        while(i < left.size() && j < right.size())
        {
            if(left.get(i) < right.get(j))
            {
                arr.set(k++, left.get(i++));
            }
            else
            {
                arr.set(k++, right.get(j++));
            }
        }

        // add the remaining elements
        while(i < left.size())
        {
            arr.set(k++, left.get(i++));
        }
        while(j < right.size())
        {
            arr.set(k++, right.get(j++));
        }

    }
}
