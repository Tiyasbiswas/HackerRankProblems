package Challenges;

import java.util.Scanner;

public class JavaOneDArray {
/*
The code in your editor does the following:
Reads an integer from stdin and saves it to a variable, n, denoting some number of integers.
Reads  integers corresponding to  from stdin and saves each integer  to a variable, .
Attempts to print each element of an array of integers named .
Write the following code in the unlocked portion of your editor:
Create an array, , capable of holding  integers.
The first line contains a single integer, , denoting the size of the array.
Each line  of the  subsequent lines contains a single integer denoting the value of element .
Output Format
You are not responsible for printing any output to stdout.Locked code in the editor loop through array  and prints each sequential element on a new line.
*/
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
