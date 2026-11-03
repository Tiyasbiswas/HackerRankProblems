package Challenges;

import java.util.Scanner;

public class UsernameValidator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        if (username.length() <= 8 || username.length() > 30) {
            System.out.println("Invalid!");
        }else{
            
        }

    }
}
