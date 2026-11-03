package Challenges;

import java.util.Arrays;
import java.util.Scanner;

/*
Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
 A < B <... < Y < Z < a < b <.. < y < z
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
/----Given a string,Str, and an integer,K , complete the function so that it finds the
lexicographically smallest and largest substrings of length .---/

Input : String: hello
        Size: 2
        Distinct Substring: [el, he, ll, lo]
Output : Smallest Substring: el
         Largest Substring: lo
 */
public class JavaStringCompare {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        System.out.print("Enter  length: ");
        int subStringLength = in.nextInt();
        in.close();
        System.out.print(getSmallestAndLargest(str,subStringLength));

    }
    public static String getSmallestAndLargest(String str, int subStringLength) {
        String smallest = str.substring(0, subStringLength);
        String largest = str.substring(0,subStringLength);

        for (int i = 1; i <= str.length() - subStringLength; i++) {
            String substring = str.substring(i, i + subStringLength);
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        return smallest + "\n" + largest;
    }
}
