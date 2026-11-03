package Challenges;
import java.util.Scanner;

/*
Given a string, str, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters.
Then, print the number of tokens, followed by each token on a new line.
Note: You may find the String.split method helpful in completing this challenge.
 */
public class StringTokens {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1. Check if there is any input at all to prevent NoSuchElementException
        if (!input.hasNextLine()) {
            System.out.println(0);
            input.close();
            return;
        }

        // 2. Read the entire line and trim the leading/trailing spaces
        String s = input.nextLine().trim();
        input.close();

        // 3. Handle the empty string edge case
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        // 4. Split using the required regex pattern
        String[] tokens = s.split("[ !,?._'@]+");

        // 5. Output the total count followed by each token
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
