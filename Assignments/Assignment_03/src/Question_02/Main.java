/*
2. Write the following method that returns the maximum value in an ArrayList of integers. The method
returns null if the list is null or the list size is 0.
 */
package Question_02;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // region Initialization and Population
        ArrayList<Integer> arr = new ArrayList<Integer>();      // arraylists cant hold primitive types
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(10);
        arr.add(20);
        arr.add(2);
        // endregion
        System.out.println(max(arr));
    }

    static Integer max(ArrayList<Integer> arr)  // O(n) approach
    {
        if(arr == null || arr.size() == 0) return null;

        // the algorithm goes as the following
        // -- brute force algorithm --
        // let max = first number and update during iteration
        Integer max = arr.get(0);
        for(Integer i : arr)
        {
            if(i > max) max = i;
        }

        return max;
    }
}