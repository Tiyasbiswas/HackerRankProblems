package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
A subarray of an n-element array is an array composed from a contiguous block of the original array's elements.
 For example, if array=[1,2,3], then the subarrays are[1],[2],[3],[1,2],[2,3],[1,2,3] and . Something like[1,3]
 would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, n find and print its number of negative subarrays on a new line.
 */
public class JavaSubArray {
//Getting AllSubarrays
     static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int[] myArray = new int[n];
         for (int i = 0; i < n; i++) {
             myArray[i] = scan.nextInt();
         }
         scan.close();
         sumOfSubArrays(myArray);
     }
    private static void sumOfSubArrays(int[] myArray) {
        List<List<Integer>> listOfSubArrays = new ArrayList<>();
        int numbers = myArray.length;
        int sum = Arrays.stream(myArray).sum();
        System.out.println(sum);

        for (int i = 0; i < numbers; i++) {
            for (int j = i; j < numbers; j++) {
                ArrayList<Integer> subarray = new ArrayList<>();
                for (int k = i; k <= j; k++)
                    subarray.add(myArray[k]);
                listOfSubArrays.add(subarray);
            }
        }
        listOfSubArrays.stream().forEachOrdered(System.out::println);
    }
}
