package Challenges;

import java.util.Scanner;

/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Given a string , print Yes if it is a palindrome, print No otherwise.
Constraints : will consist at most  lower case english letters.
Sample Input
madam
Sample Output
Yes
 */
public class StringReverse {

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.nextLine();
        in.close();
        StringBuffer sb = new StringBuffer(str);
        if(str.equals(sb.reverse().toString())){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }



    }
}
