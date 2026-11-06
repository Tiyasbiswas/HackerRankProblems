package Challenges;

import java.util.Scanner;

public class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

    static void main(String[] args) {
        /* 7,29            :of less than 8 or greater than 30 characters, then it is an invalid username.
         * ^               : Starts with
         * [a-zA-Z]        : An alphabetic character
         * [a-zA-Z0-9_]*   : Followed by zero or more alphanumeric characters or underscores
         * $               : Ends with
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();

            boolean isValid = username.matches(regularExpression);
                System.out.println(username + " -> " + (isValid ? "Valid" : "Invalid"));
            }



}
