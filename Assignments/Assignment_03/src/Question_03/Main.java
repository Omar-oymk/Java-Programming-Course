///*
//3. Write the following method that sorts an ArrayList of numbers:
//public static void sort(ArrayList<Integer> list)
// */
//
//package Question_03;
//import java.util.ArrayList;
//
//public class Main
//{
//    public static void main(String[] args)
//    {
//
//    }
//
//    static ArrayList<Integer> mergeSort(ArrayList<Integer> arr)    // merge sort (O(nlog(n) approach)
//    {
//        // safety case
//        if (arr == null) return null;
//        // base case
//        if(arr.size() <= 1) return arr;
//
//
//        // split the arraylist
//        ArrayList<Integer> split1 = new ArrayList<>(arr.subList(0, arr.size() / 2));
//        ArrayList<Integer> split2 = new ArrayList<>(arr.subList(arr.size() / 2, arr.size()));
//        ArrayList<Integer> left = mergeSort(split1);
//        ArrayList<Integer> right = mergeSort(split2);
//
//        return()
//    }
//}
