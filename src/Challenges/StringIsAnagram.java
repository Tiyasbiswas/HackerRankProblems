package Challenges;

import java.util.Arrays;
import java.util.Scanner;

/*
Two strings,a and b,are called anagrams if they contain all the same characters in the same frequencies. For this challenge,
the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
Function Description
Complete the isAnagram function in the editor.
isAnagram has the following parameters:
String a: the first string
String b: the second string
Returns ->boolean: If str1 and  str2 are case-insensitive anagrams, return true. Otherwise, return false.
Input Format
The first line contains a string .
The second line contains a string .
 */
public class StringIsAnagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Strings: ");
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        in.close();
        boolean result = isAnagram(str1, str2);
        System.out.println(result);
    }

    static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) { return false; }
        StringBuilder sb = new StringBuilder(str2.toLowerCase());
        for (char ch : str1.toLowerCase().toCharArray()) {
            int index = sb.indexOf(String.valueOf(ch));
            if (index == -1) { return false; }
            sb.deleteCharAt(index);
        }
        return true;
    }
}
